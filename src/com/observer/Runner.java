package com.observer;

import java.util.Random;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TemperatureGenerator temp = new TemperatureGenerator();
		PressureGenerator press = new PressureGenerator();
		Thread t = new Thread(temp);
		Thread t2 = new Thread(press);
		t.start();
		t2.start();
	}

}
