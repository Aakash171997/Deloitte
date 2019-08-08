package com.inputOutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Sample implements Serializable{
	private static final long serialVersionUID = 5869133736550044623L;
	private int i;
	private double j;
	private String str;
	
	public Sample() {
		// TODO Auto-generated constructor stub
	}
	
	public Sample(int i, double d, String str) {
		super();
		this.i = i;
		this.j = d;
		this.str = str;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public double getJ() {
		return j;
	}

	public void setJ(float j) {
		this.j = j;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "Sample [i=" + i + ", j=" + j + ", str=" + str + "]";
	}
	
}

public class Demo3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectOutputStream stream = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(new File("C:\\deloitte\\sample.txt"))));
		
		Sample sample = new Sample(1, 35.5, "YoLo");
		
		System.out.println(sample.toString());
		
		stream.writeObject(sample);
		stream.close();
		
		ObjectInputStream streamIn = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(new File("C:\\deloitte\\sample.txt"))));
		
		Sample newSample = new Sample();
		newSample = (Sample) streamIn.readObject();
		
		System.out.println(newSample.toString());
		
		streamIn.close();
		
	}

}
