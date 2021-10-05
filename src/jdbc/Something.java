package jdbc;

public class Something {
private String something;
private int id;
public Something(String string, String string2) {
	// TODO Auto-generated constructor stub
	this.id=Integer.parseInt(string2);
	this.something=string;
}
public String getSomething() {
	return something;
}
public void setSomething(String something) {
	this.something = something;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
}
