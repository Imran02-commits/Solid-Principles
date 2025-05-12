package com.InterfaceSegregationPrinciple.pack;

public class ISP {

	public static void main(String[] args) {
		
		System.out.println("=====ISP=====");
		Human human = new Human();
		Robot robot = new Robot();
		
		human.eat();
		human.work();
		
		robot.work();

	}

}
