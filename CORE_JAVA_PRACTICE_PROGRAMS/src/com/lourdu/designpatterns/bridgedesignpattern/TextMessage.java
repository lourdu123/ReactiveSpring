package com.lourdu.designpatterns.bridgedesignpattern;

public class TextMessage extends Message{

	public TextMessage(MessageSender messageSender) {
		super(messageSender);
	}

	@Override
	public void send() {
		messageSender.sendMessage();
	}

}
