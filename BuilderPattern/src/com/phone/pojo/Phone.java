package com.phone.pojo;

public class Phone {
	
	private String OS;
	private int RAM;
	private String processor;
	private double screenSize;
	private int battery;
	
	private Phone() {}

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
	
	public static class Builder {
		
		private String OS;
		private int RAM;
		private String processor;
		private double screenSize;
		private int battery;
		
		public Builder() {}
		
		public Builder os(String OS) {
			this.OS = OS;
			return this;
		}
		
		public Builder ram(int ram) {
			this.RAM = ram;
			return this;
		}
		
		public Builder processor(String processor) {
			this.processor = processor;
			return this;
		}
		
		public Builder screenSize(double screenSize) {
			this.screenSize = screenSize;
			return this;
		}
		
		public Builder battery(int battery) {
			this.battery = battery;
			return this;
		}
		
		public Phone build() {
			Phone phone = new Phone();
			
			phone.setBattery(this.battery);
			phone.setOS(this.OS);
			phone.setScreenSize(this.screenSize);
			phone.setRAM(this.RAM);
			phone.setProcessor(this.processor);
			
			return phone;
		}
	}
	
}
