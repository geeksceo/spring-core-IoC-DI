package com.journaldev.java.legacy;

public class MyDIApplication implements Customer {

	private MessageService service;
	
	public MyDIApplication(MessageService svc) {
		this.service = svc;
	}
		
	@Override
	public void processMessages(String msg, String rec) {
		
	}
	
}
