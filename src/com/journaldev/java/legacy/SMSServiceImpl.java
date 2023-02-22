package com.journaldev.java.legacy;

public class SMSServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String rec) {
		// logic to send message
		System.out.println("SMS sent to "+rec+" with message: "+msg);
	}
	
}
