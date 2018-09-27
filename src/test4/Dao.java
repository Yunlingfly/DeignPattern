package test4;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Dao {
	String url="jdbc:sqlserver://localhost:1433; DatabaseName=Restaurant";
	String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	        
	Statement st;
	Connection con;
	public void add(String[] form,int num,Detair detair)throws SQLException{			//添加两张表
		try{
			Class.forName(driver);//加载驱动
			}
			catch(ClassNotFoundException event){System.out.print("无法创建驱动程式实体!");}
			
			con=DriverManager.getConnection(url,"sa","123");
			con.setAutoCommit(true);
			System.out.println("准备插入数据，已经连接到数据库...");
			String personSQL="insert into 订单表 "
					+" (用户ID,订单时间) values(?,?)";
			
			PreparedStatement pre=null;
			ResultSet rs=null;
			try{
				con.setAutoCommit(false);
				pre=con.prepareStatement(personSQL);
				int index=1;
				pre.setInt(index++, num);		//保存用户ID
				
				Date now = new Date(); 
		     	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式

		     	String hehe = dateFormat.format( now ); 
				pre.setString(index++, hehe);	//保存时间
				
				pre.executeUpdate();		//执行SQL
				pre.executeBatch();
				con.commit();				//提交事务

			}finally {
				if(rs!=null) rs.close();
				if(pre!=null) pre.close();
			}
			con=DriverManager.getConnection(url,"sa","123");
			con.setAutoCommit(true);
			System.out.println("准备读出订单号，已经连接到数据库...");
			st=con.createStatement();
			ResultSet rsr=st.executeQuery("SELECT 订单号 from 订单表 where 用户ID="+num+" ");
			int name=0;
			while(rsr.next()){
				name=rsr.getInt("订单号");
			}
    	    System.out.println("订单号为："+name);
    	    detair.setDingdan(name);
    	     
			con=DriverManager.getConnection(url,"sa","123");
			
			for(int i=0;i<form.length;i++){
			con.setAutoCommit(true);
			System.out.println("准备添加配料，已经连接到数据库...");
			String personSQL1="insert into 配料表 "		//添加配料
					+" (订单号,配料,数量) values(?,?,?)";
			System.out.println(form[i]);
			String[] v=form[i].split("\\*");		//按*分割配料
			PreparedStatement pre1=null;
			ResultSet rs1=null;
			try{
				con.setAutoCommit(false);
				pre1=con.prepareStatement(personSQL1);
				int index=1;
				pre1.setInt(index++, name);			//订单号与订单表一致
				
				pre1.setString(index++, v[0]);		//配料名
				
				pre1.setInt(index++, Integer.parseInt(v[1]));	//数量
				
				pre1.executeUpdate();		//执行SQL
				pre1.executeBatch();
				con.commit();				//提交事务

			}catch (Exception e) {
				// TODO: handle exception
			}
			}//for
			if(con!=null) con.close();
	}
	
	public Detair list(int num)throws SQLException{		//罗列
		Detair detair=new Detair();
		con=DriverManager.getConnection(url,"sa","123");
		con.setAutoCommit(true);
		System.out.println("准备列出数据，已经连接到数据库...");
		Statement st=null;
		ResultSet rs=null;
		try{
			st=con.createStatement();
			rs=st.executeQuery(" select * from 配料表 p join 订单表 on 订单表.订单号=p.订单号 where p.订单号="+num+" ");	//根据订单号查
			detair.setInfo("物品有：");
			while(rs.next()){
				detair.setDingdan(rs.getInt("订单号"));
				detair.setTime(rs.getString("订单时间"));
				if(rs.getString("配料").equals("干米线")){
					detair.setInfo(detair.getInfo()+"干米线*"+rs.getInt("数量"));
					detair.setPrice(rs.getInt("数量")*10);
				}
				else if(rs.getString("配料").equals("水米线")){
					detair.setInfo(detair.getInfo()+"水米线*"+rs.getInt("数量"));
					detair.setPrice(rs.getInt("数量")*11);
				}
				else if(rs.getString("配料").equals("酸米线")){
					detair.setInfo(detair.getInfo()+"酸米线*"+rs.getInt("数量"));
					detair.setPrice(rs.getInt("数量")*12);
				}
				else if(rs.getString("配料").equals("豆腐")){
					detair.setInfo(detair.getInfo()+"豆腐*"+rs.getInt("数量"));
					detair.setPrice(detair.getPrice()+rs.getInt("数量")*1);
				}
				else if(rs.getString("配料").equals("鸡蛋")){
					detair.setInfo(detair.getInfo()+"鸡蛋*"+rs.getInt("数量"));
					detair.setPrice(detair.getPrice()+rs.getInt("数量")*1);
				}
				else if(rs.getString("配料").equals("牛肉")){
					detair.setInfo(detair.getInfo()+"牛肉*"+rs.getString("数量"));
					detair.setPrice(detair.getPrice()+rs.getInt("数量")*2);
				}
			}
		}finally{
			if(rs!=null) rs.close();
			if(st!=null) st.close();
			if(con!=null) con.close();
		}
		return detair;
	}	//list
}
