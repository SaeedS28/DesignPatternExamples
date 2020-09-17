package com.phone.pojo;

import com.phone.interfaces.PhoneBuilder;

public class PhoneEngineer {
	
	private PhoneBuilder pb;
	
	public PhoneEngineer(PhoneBuilder pb) {
		this.pb = pb;
	}
	
	public void buildPhone() {
		this.pb.setBattery();
		this.pb.setOS();
		this.pb.setProcessor();
		this.pb.setRAM();
		this.pb.setScreenSize();
	}
	
	public Phone getPhone() {
		return this.pb.getPhone();
	}

}
