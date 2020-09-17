package com.phone.pojo;

import com.phone.interfaces.PhonePlan;

public class Phone implements PhonePlan {
	
	private String OS;
	private int RAM;
	private String processor;
	private double screenSize;
	private int battery;

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Phone [OS=" + OS + ", RAM=" + RAM + ", processor=" + processor + ", screenSize=" + screenSize
				+ ", battery=" + battery + "]";
	}	
}
