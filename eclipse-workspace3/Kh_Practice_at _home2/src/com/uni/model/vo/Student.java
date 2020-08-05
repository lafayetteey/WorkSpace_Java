package com.uni.model.vo;

public class Student extends Human {
	private String number;
	private String major;
	
	public Student() {
		
	}
	public Student(String name , int age , int height , int weight , String number , String major) {
		super(name , age , height , weight);
		this.number = number;
		this.major = major;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String prnInfo() {
		return super.prnInfo() + number + ", " + major;
	}
}
