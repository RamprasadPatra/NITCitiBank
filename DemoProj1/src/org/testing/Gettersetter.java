package org.testing;

public class Gettersetter {
	    String name;
	    
		public void GetProperty()
		{
			input(name);
		}
		public void input(String name)
		{
			System.out.println("Your name is:"+name);
		}
		//setter method
		public String setName(String name)
		{
			return this.name=name;
		}
		public String getName()
		{
			return name;
		}
		
		public static void main(String[] args)
		{
			Gettersetter get=new Gettersetter();
			get.setName("Ramprasad");
			get.GetProperty();
		}
}