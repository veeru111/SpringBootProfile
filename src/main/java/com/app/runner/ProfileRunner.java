package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.serviceinter.InotificationInterface;

@Component
public class ProfileRunner implements CommandLineRunner {
	
	@Autowired
	private InotificationInterface noti;

	@Override
	public void run(String... args) throws Exception {
		
		noti.Inform();
		

	}

}
