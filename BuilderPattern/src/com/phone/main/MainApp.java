package com.phone.main;

import com.phone.pojo.Phone;

public class MainApp {
	public static void main(String[] args) {
		Phone pixel = new Phone.Builder()
				.battery(3100)
				.os("Android 11")
				.processor("Qualcomm")
				.screenSize(5.8)
				.ram(6)
				.build();
		
		System.out.println(pixel);
	}
}
