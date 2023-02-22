package com.journaldev.java.legacy;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Customer getCustomer() {
		// TODO Auto-generated method stub
		return new MyDIApplication(new SMSServiceImpl());
	}
	

}
