package com.phone.pojo;

import com.phone.interfaces.PhoneBuilder;

public class AndroidBuilder implements PhoneBuilder {
	private Phone androidPhone;
	
	public AndroidBuilder() {
		this.androidPhone = new Phone();
	}
	
	@Override
	public void setOS() {
		this.androidPhone.setOS("Android 11");
	}

	@Override
	public void setRAM() {
		this.androidPhone.setRAM(6);
	}

	@Override
	public void setProcessor() {
		this.androidPhone.setProcessor("Qualcomm 730");
	}

	@Override
	public void setScreenSize() {
		this.androidPhone.setScreenSize(5.8);
	}

	@Override
	public void setBattery() {
		this.androidPhone.setBattery(3100);
	}

	@Override
	public Phone getPhone() {
		return this.androidPhone;
	}

}
