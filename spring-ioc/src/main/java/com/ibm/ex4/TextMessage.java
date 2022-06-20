package com.ibm.ex4;

public class TextMessage implements Message{
	
	public TextMessage() {
		System.out.println("Text Message constructor");
	}

	@Override
	public void send(String to, String msg) {
		// TODO Auto-generated method stub
		System.out.println("Text sent to: "+to+" as: "+msg);
		
	}
}
