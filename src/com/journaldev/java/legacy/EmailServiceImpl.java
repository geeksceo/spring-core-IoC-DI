package com.journaldev.java.legacy;

public class EmailServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String rec) {
		// logic to send message
		System.out.println("Email sent to "+rec+" with message: "+msg);
	}
		
}
