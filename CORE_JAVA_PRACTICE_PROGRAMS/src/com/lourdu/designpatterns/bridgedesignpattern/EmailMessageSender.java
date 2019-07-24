package com.lourdu.designpatterns.bridgedesignpattern;

public class EmailMessageSender implements MessageSender {

	@Override
	public void sendMessage() {
         System.out.println("Sending Email..");
	}

}
