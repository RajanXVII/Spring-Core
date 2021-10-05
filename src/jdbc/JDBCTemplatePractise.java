package jdbc;

import java.sql.Types;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTemplatePractise {
	
	private JdbcTemplate jdbctemplate; 

	

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	public List<Something> getQueryResult() {
		//return jdbctemplate.queryForObject("select * from table1 WHERE ID = ?",new Object[] {1}, (rs,rowNum)->new Something(rs.getString("something"),rs.getString("id")));
		return jdbctemplate.query("select * from table1", (rs,rowNum)->new Something(rs.getString("something"),rs.getString("id")));
	}
	public int deleteQueryResult(int id) {
		//return jdbctemplate.queryForObject("select * from table1 WHERE ID = ?",new Object[] {1}, (rs,rowNum)->new Something(rs.getString("something"),rs.getString("id")));
		return jdbctemplate.update("delete from table1 where id=?",new Object[] {id});
	}
	public int updateQueryResult(int id) {
		//return jdbctemplate.queryForObject("select * from table1 WHERE ID = ?",new Object[] {1}, (rs,rowNum)->new Something(rs.getString("something"),rs.getString("id")));
		int[] types= {Types.VARCHAR,Types.INTEGER};
		return jdbctemplate.update("update table1 set something=? where id=?",new Object[]{"xyz",id},types);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext ctx=new ClassPathXmlApplicationContext(System.getProperty("jdbcprops/dbcTemplatePractise.xml");
		ApplicationContext ctx=new FileSystemXmlApplicationContext(System.getProperty("user.dir")+"/jdbcTemplatePractise.xml");
		JDBCTemplatePractise jt=(JDBCTemplatePractise)ctx.getBean("jdbcTemp");
		List<Something> st=jt.getQueryResult();
		int delete=jt.deleteQueryResult(1);
		int update=jt.updateQueryResult(2);
		for(Something s:st) {
			System.out.println("Something is "+s.getSomething()+" and id is "+s.getId());
		}
		((FileSystemXmlApplicationContext)ctx).close();

	}

}
