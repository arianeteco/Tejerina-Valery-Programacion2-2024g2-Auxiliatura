package math;

public class Vector {
	Integer x;
	Integer y;
	public Vector (Integer x,Integer y) {
		this.x = x;
		this.y = y;
	}
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	
	public String Tipo1() {
		return "X es "+ x +" Y es "+ y; 
	}
}