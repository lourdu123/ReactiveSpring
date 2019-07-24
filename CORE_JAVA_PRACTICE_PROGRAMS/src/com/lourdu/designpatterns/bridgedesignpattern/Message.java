package com.lourdu.designpatterns.bridgedesignpattern;

public abstract class Message {
	
	// has a relationship between 2 abstractions. i.e Message and MessageSender
	protected MessageSender messageSender;
	
	public Message(MessageSender messageSender){
		this.messageSender=messageSender;
	}

	public abstract void send();
}
