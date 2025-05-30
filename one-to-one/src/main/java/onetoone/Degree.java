package onetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Degree {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String degree;
	private double sslcpercentage;
	private double hsspercentage;
	private double degreepercentage;
	private int yop;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public double getSslcpercentage() {
		return sslcpercentage;
	}
	public void setSslcpercentage(double sslcpercentage) {
		this.sslcpercentage = sslcpercentage;
	}
	public double getHsspercentage() {
		return hsspercentage;
	}
	public void setHsspercentage(double hsspercentage) {
		this.hsspercentage = hsspercentage;
	}
	public double getDegreepercentage() {
		return degreepercentage;
	}
	public void setDegreepercentage(double degreepercentage) {
		this.degreepercentage = degreepercentage;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	@Override
	public String toString() {
		return "Degree [id=" + id + ", degree=" + degree + ", sslcpercentage=" + sslcpercentage + ", hsspercentage="
				+ hsspercentage + ", degreepercentage=" + degreepercentage + ", yop=" + yop + "]";
	}
	

}
