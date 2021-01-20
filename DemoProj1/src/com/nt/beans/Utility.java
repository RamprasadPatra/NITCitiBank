package com.nt.beans;
import java.util.Date;

public class Utility {
	
	public Date getSysDate()
	{
		return new Date();
	}
	public void m1()
	{
		System.out.println("Hello M1 method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
		System.out.println(u.getSysDate());
	}
}