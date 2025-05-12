package com.DependencyInversionPrinciple.pack;

public class Application 
{
	private Database db;
	
	public Application(Database db)
	{
		this.db = db;
	}
	
	public void start()
	{
		db.connect();
	}

}
