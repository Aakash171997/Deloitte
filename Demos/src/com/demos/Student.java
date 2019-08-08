package com.demos;

public class Student {
	private int studID;
	private String studName;
	private int fees;
	private int marks;
	
	public Student() {
		studID = 0;
		studName = "NA";
		fees = 10000;
		marks = 50;
	}

	public Student(int studID, String studName, int fees, int marks) {
		this(studID, studName, marks);
		this.fees = fees;
	}

	public Student(int studID, String studName, int marks) {
		this(studID, studName);
		this.marks = marks;
	}

	public Student(int studID, String studName) {
		this();
		this.studID = studID;
		this.studName = studName;
	}
	
	public void print() {
		System.out.println(studID+" - "+studName+" - fees= "+fees+" - marks= "+marks);
	}
	
	public static void main(String[] args) {
		Student student = new Student(1,"Anwesh", 80);
		
		student.print();
	}
	
}
