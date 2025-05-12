package com.DependencyInversionPrinciple.pack;

public class DIP_Class {

	public static void main(String[] args) 
	{
		MySqlDatabase mysql = new MySqlDatabase();
		Application app = new Application(mysql);
		
		app.start();
		

	}

}
