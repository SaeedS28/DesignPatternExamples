package com.phone.pojo;

import com.phone.interfaces.PhoneBuilder;

public class IPhoneBuilder implements PhoneBuilder {
	private Phone applePhone;
	
	public IPhoneBuilder() {
		this.applePhone = new Phone();
	}
	
	@Override
	public void setOS() {
		this.applePhone.setOS("iOS 14");
	}

	@Override
	public void setRAM() {
		this.applePhone.setRAM(4);
	}

	@Override
	public void setProcessor() {
		this.applePhone.setProcessor("T8030 \"A13 Bionic\"");
	}

	@Override
	public void setScreenSize() {
		this.applePhone.setScreenSize(6.46);
	}

	@Override
	public void setBattery() {
		this.applePhone.setBattery(3696);
	}

	@Override
	public Phone getPhone() {
		return this.applePhone;
	}

}
