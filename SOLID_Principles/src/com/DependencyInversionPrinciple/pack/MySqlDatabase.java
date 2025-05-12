package com.DependencyInversionPrinciple.pack;

public class MySqlDatabase implements Database{
	
	public void connect()
	{
		System.out.println("Connected to MySql Database....");
	}

}
