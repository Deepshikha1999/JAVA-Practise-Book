package com.ibm.ex4;

public class WhatsAppMessage implements Message {

	@Override
	public void send(String to, String msg) {
		// TODO Auto-generated method stub
		System.out.println("Whats App sent to: "+to+" as: "+msg);

	}

	public WhatsAppMessage() {
		System.out.println("Whats App Message constructor");
	}

}
