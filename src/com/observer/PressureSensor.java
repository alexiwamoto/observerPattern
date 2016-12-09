package com.observer;

import java.util.Observable;

public class PressureSensor extends Observable {
	
	private int pressure;

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
		setChanged();
		notifyObservers();
	}
}
