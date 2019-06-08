package com.app.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.serviceinter.InotificationInterface;

@Component
@Profile("sms")
public class SmsProfile implements InotificationInterface {

	@Override
	public void Inform() {
		
		System.out.println("from the smsProfile");

		
	}

}
