package com.journaldev.java.legacy;

public class MyApplication {

	private EmailService email = null;
	
	public MyApplication(EmailService svc) {
		this.email = svc;
	}
	
	public void processMessages(String msg, String rec) {
		// do some message validation, manipulation logic etc
		this.email.sendEmail(msg, rec);
	}
	
}
