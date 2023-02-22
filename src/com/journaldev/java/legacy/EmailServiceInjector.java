package com.journaldev.java.legacy;

public class EmailServiceInjector implements MessageServiceInjector{
	
	public Customer getCustomer() {
		return new MyDIApplication(new EmailServiceImpl());
	}
		
	
}
