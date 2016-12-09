package com.observer;

import java.util.Random;

public class TemperatureGenerator implements Runnable {

	private void randomGenerator() {
		Random generator = new Random();
		Sensor sensor = new Sensor();
		Screen screen = new Screen(sensor);
		for (int i = 0; i < 50; i++) {
			sensor.setTemperature(generator.nextInt(100));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }		
	}

	@Override
	public void run() {
		randomGenerator();		
	}
	
}
