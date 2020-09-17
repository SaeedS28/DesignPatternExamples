package com.phone.main;

import com.phone.interfaces.PhoneBuilder;
import com.phone.pojo.AndroidBuilder;
import com.phone.pojo.IPhoneBuilder;
import com.phone.pojo.Phone;
import com.phone.pojo.PhoneEngineer;

public class MainApp {
	public static void main(String[] args) {
		PhoneBuilder pixel = new AndroidBuilder();
		PhoneEngineer pe = new PhoneEngineer(pixel);
		pe.buildPhone();
		Phone pixelPhone = pe.getPhone();
		
		System.out.println(pixelPhone);
		
		PhoneBuilder iPhoneBuilder = new IPhoneBuilder();
		PhoneEngineer pe2 = new PhoneEngineer(iPhoneBuilder);
		pe2.buildPhone();
		Phone iPhone11 = pe.getPhone();
		
		System.out.println(iPhone11);
	}
}
