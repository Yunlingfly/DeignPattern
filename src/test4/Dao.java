package test4;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Dao {
	String url="jdbc:sqlserver://localhost:1433; DatabaseName=Restaurant";
	String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	        
	Statement st;
	Connection con;
	public void add(String[] form,int num,Detair detair)throws SQLException{			//������ű�
		try{
			Class.forName(driver);//��������
			}
			catch(ClassNotFoundException event){System.out.print("�޷�����������ʽʵ��!");}
			
			con=DriverManager.getConnection(url,"sa","123");
			con.setAutoCommit(true);
			System.out.println("׼���������ݣ��Ѿ����ӵ����ݿ�...");
			String personSQL="insert into ������ "
					+" (�û�ID,����ʱ��) values(?,?)";
			
			PreparedStatement pre=null;
			ResultSet rs=null;
			try{
				con.setAutoCommit(false);
				pre=con.prepareStatement(personSQL);
				int index=1;
				pre.setInt(index++, num);		//�����û�ID
				
				Date now = new Date(); 
		     	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//���Է�����޸����ڸ�ʽ

		     	String hehe = dateFormat.format( now ); 
				pre.setString(index++, hehe);	//����ʱ��
				
				pre.executeUpdate();		//ִ��SQL
				pre.executeBatch();
				con.commit();				//�ύ����

			}finally {
				if(rs!=null) rs.close();
				if(pre!=null) pre.close();
			}
			con=DriverManager.getConnection(url,"sa","123");
			con.setAutoCommit(true);
			System.out.println("׼�����������ţ��Ѿ����ӵ����ݿ�...");
			st=con.createStatement();
			ResultSet rsr=st.executeQuery("SELECT ������ from ������ where �û�ID="+num+" ");
			int name=0;
			while(rsr.next()){
				name=rsr.getInt("������");
			}
    	    System.out.println("������Ϊ��"+name);
    	    detair.setDingdan(name);
    	     
			con=DriverManager.getConnection(url,"sa","123");
			
			for(int i=0;i<form.length;i++){
			con.setAutoCommit(true);
			System.out.println("׼��������ϣ��Ѿ����ӵ����ݿ�...");
			String personSQL1="insert into ���ϱ� "		//�������
					+" (������,����,����) values(?,?,?)";
			System.out.println(form[i]);
			String[] v=form[i].split("\\*");		//��*�ָ�����
			PreparedStatement pre1=null;
			ResultSet rs1=null;
			try{
				con.setAutoCommit(false);
				pre1=con.prepareStatement(personSQL1);
				int index=1;
				pre1.setInt(index++, name);			//�������붩����һ��
				
				pre1.setString(index++, v[0]);		//������
				
				pre1.setInt(index++, Integer.parseInt(v[1]));	//����
				
				pre1.executeUpdate();		//ִ��SQL
				pre1.executeBatch();
				con.commit();				//�ύ����

			}catch (Exception e) {
				// TODO: handle exception
			}
			}//for
			if(con!=null) con.close();
	}
	
	public Detair list(int num)throws SQLException{		//����
		Detair detair=new Detair();
		con=DriverManager.getConnection(url,"sa","123");
		con.setAutoCommit(true);
		System.out.println("׼���г����ݣ��Ѿ����ӵ����ݿ�...");
		Statement st=null;
		ResultSet rs=null;
		try{
			st=con.createStatement();
			rs=st.executeQuery(" select * from ���ϱ� p join ������ on ������.������=p.������ where p.������="+num+" ");	//���ݶ����Ų�
			detair.setInfo("��Ʒ�У�");
			while(rs.next()){
				detair.setDingdan(rs.getInt("������"));
				detair.setTime(rs.getString("����ʱ��"));
				if(rs.getString("����").equals("������")){
					detair.setInfo(detair.getInfo()+"������*"+rs.getInt("����"));
					detair.setPrice(rs.getInt("����")*10);
				}
				else if(rs.getString("����").equals("ˮ����")){
					detair.setInfo(detair.getInfo()+"ˮ����*"+rs.getInt("����"));
					detair.setPrice(rs.getInt("����")*11);
				}
				else if(rs.getString("����").equals("������")){
					detair.setInfo(detair.getInfo()+"������*"+rs.getInt("����"));
					detair.setPrice(rs.getInt("����")*12);
				}
				else if(rs.getString("����").equals("����")){
					detair.setInfo(detair.getInfo()+"����*"+rs.getInt("����"));
					detair.setPrice(detair.getPrice()+rs.getInt("����")*1);
				}
				else if(rs.getString("����").equals("����")){
					detair.setInfo(detair.getInfo()+"����*"+rs.getInt("����"));
					detair.setPrice(detair.getPrice()+rs.getInt("����")*1);
				}
				else if(rs.getString("����").equals("ţ��")){
					detair.setInfo(detair.getInfo()+"ţ��*"+rs.getString("����"));
					detair.setPrice(detair.getPrice()+rs.getInt("����")*2);
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
