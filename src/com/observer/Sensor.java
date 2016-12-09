package com.observer;

import java.util.Observable;

public class Sensor extends Observable{
	
	private int temperature;

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperatura) {
		this.temperature = temperatura;
		setChanged();
		notifyObservers();
	}
}
