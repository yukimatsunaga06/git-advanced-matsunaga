package com.example.main;
/**
 * 車のドメイン
 * @author yukimatsunaga
 *
 */

public class Car {

	private int speed;
	private String name;
	private int gaso;
	
	 
	
	public Car() {
		
	}
	
	
	public Car(int speed, String name) {
		super();
		this.speed = speed;
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Car [speed=" + speed + ", name=" + name + "]";
	}
	
}
