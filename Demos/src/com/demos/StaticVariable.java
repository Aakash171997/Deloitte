package com.demos;

class Doctor{
	String docName;
	int fees, docID;
	static int counter;
	
	public Doctor() {
		docName = "NA";
		fees = 500000;
		docID = ++counter;
	}
	
	static {
		System.out.println("Class Loaded");
	}
	
	{
		System.out.println("Object created");
	}
	public Doctor(String docName) {
		this();
		this.docName = docName;
	}

	public Doctor(String docName, int fees) {
		this(docName);
		this.fees = fees;
	}
	
	public void addFees(int fees) {
		this.fees += fees;
	}
	
	public void getDetails() {
		System.out.println("ID: "+docID+" Doctor Name: "+docName+" Fees: "+fees);
	}
	
	//StaticMethod
	public static void getRecord() {
		System.out.println("You have created "+counter+" Doctor objects");
	}
}

public class StaticVariable {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Hello");
		Doctor.counter = 0;
		Doctor doctor1 = new Doctor();
		Doctor doctor2 = new Doctor("Isha");
		Doctor doc3 = new Doctor("Anwesh", 40000);
		
		doctor1.addFees(76000);
		
		doctor1.getDetails();
		doctor2.getDetails();
		Doctor.getRecord();
	}

}
