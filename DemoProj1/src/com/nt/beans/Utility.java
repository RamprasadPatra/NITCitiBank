package com.nt.beans;
import java.util.Date;

public class Utility {
	
	public Date getSysDate()
	{
		return new Date();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
		System.out.println(u.getSysDate());
	}
}