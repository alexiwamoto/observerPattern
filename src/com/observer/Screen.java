package com.observer;

import java.util.Observable;
import java.util.Observer;

public class Screen implements Observer{

	Observable sensor;
	
	int newTemperature;
	int newPressure;
	
	public Screen(Observable sensor) {		
		this.sensor = sensor;
		sensor.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Sensor) {
			Sensor sensor = (Sensor) o;
			newTemperature = sensor.getTemperature();
			System.out.println("Temperatura atual:" + newTemperature);
		}else {
			PressureSensor sensor = (PressureSensor)o;
			newPressure = sensor.getPressure();
			System.out.println("Pressão Medida:" + newPressure);
		}	
		
	}

	
}
