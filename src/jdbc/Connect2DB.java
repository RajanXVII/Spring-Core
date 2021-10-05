package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.jdbc.PreparedStatement;

public class Connect2DB {
	private DataSource datasource;
	private String abc;
	public String getAbc() {
		return abc;
	}
	public void setAbc(String abc) {
		this.abc = abc;
	}
	public void setDataSource(DataSource datasource) {
		this.datasource = datasource;
	}
	public void getquery() throws SQLException{
		Connection conn = datasource.getConnection();
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from rajan.table1");
		while(rs.next()) {
			System.out.println(rs.getString("id"));
		}
	}
	public void deleteQuery(int id) throws SQLException{
		Connection conn = datasource.getConnection();
		java.sql.PreparedStatement st=conn.prepareStatement("delete from rajan.table1 where id=?");
		st.setInt(1, id);
		st.execute();
		
	}
	public void updateQuery(int id) throws SQLException{
		Connection conn = datasource.getConnection();
		java.sql.PreparedStatement st=conn.prepareStatement("update table1 set something=?  where id=?");
		st.setString(1, "somethingthird");
		st.setInt(2, id);
		st.execute();
		
	}
	public static void main(String[] args) throws SQLException {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("jdbcprops/datasourcePractise.xml");
		Connect2DB gc=(Connect2DB) context.getBean("connect2DB");	
		gc.getquery();
		gc.deleteQuery(2);
		gc.updateQuery(3);
		System.out.println(gc.getAbc());
		context.close();
	}
}
