package com.app.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.serviceinter.InotificationInterface;

@Component
@Profile("mail")
public class MailNotification implements InotificationInterface {

	@Override
	public void Inform() {

		System.out.println("in mailnotification");
	}

}
