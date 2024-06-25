package com.course.manage;

public class Courses {
	
	private int id;
	private String cname;
	private String duration;
	private String price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", cname=" + cname + ", duration=" + duration + ", price=" + price + "]";
	}
	public Courses(String cname, String duration, String price) {
		super();
		
		this.cname = cname;
		this.duration = duration;
		this.price = price;
	}
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
