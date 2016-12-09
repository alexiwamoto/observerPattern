package com.observer;

import java.util.Random;

public class PressureGenerator implements Runnable {
	
	private void randomGenerator() {
		Random generator = new Random();
		PressureSensor sensor = new PressureSensor();
		Screen screen = new Screen(sensor);
		for (int i = 0; i < 50; i++) {
			sensor.setPressure(generator.nextInt(100));
			try {
				Thread.sleep(4000);
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
