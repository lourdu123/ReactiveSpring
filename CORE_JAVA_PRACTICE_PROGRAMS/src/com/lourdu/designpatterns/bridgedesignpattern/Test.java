package com.lourdu.designpatterns.bridgedesignpattern;

public class Test {

	public static void main(String[] args) {
		TextMessageSender tms = new TextMessageSender();
		TextMessage tm = new TextMessage(tms);
		tm.send();
		
		EmailMessageSender ems = new EmailMessageSender();
        EmailMessage em = new EmailMessage(ems);
		em.send();
	}
}
