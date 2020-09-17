package com.phone.interfaces;

import com.phone.pojo.Phone;

public interface PhoneBuilder {
	
	public void setOS();

	public void setRAM();

	public void setProcessor();

	public void setScreenSize();

	public void setBattery();
	
	public Phone getPhone();
}
