package wan;

import java.sql.*;

public class Some {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:sqlserver://115.159.115.102:1433; DatabaseName=sometest";
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

		Statement st;
		Connection con;
		try {
			Class.forName(driver);// ��������
		} catch (ClassNotFoundException event) {
			System.out.print("�޷�����������ʽʵ��!");
		}
		try {
			con = DriverManager.getConnection(url, "zzy", "123");
			System.out.println("�Ѿ����ӵ����ݿ�...");
			st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * from sometable ");

			while (rs.next()) {
				String name = rs.getString("name");
				System.out.println(name);
			}

			st.close();
			con.close();
		} catch (SQLException e1) {
			System.out.println("�쳣��" + e1);
		}
	}
}