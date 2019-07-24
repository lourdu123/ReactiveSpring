package com.lourdu.designpatterns.bridgedesignpattern;

public class TextMessageSender implements MessageSender{

	@Override
	public void sendMessage() {
        System.out.println("Sending SMS..");		
	}

}
