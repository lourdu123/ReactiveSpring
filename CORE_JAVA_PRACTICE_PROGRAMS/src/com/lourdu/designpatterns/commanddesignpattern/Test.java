package com.lourdu.designpatterns.commanddesignpattern;

public class Test {

	public static void main(String[] args) {
		Car car = new Car();
		Command carStart = new CarStartCommand(car);
		RemoteControl rc = new RemoteControl(carStart);
		rc.execute();
		
		Command carStop = new CarStopCommand(car);
		RemoteControl rc1 = new RemoteControl(carStop);
		rc1.execute();
		
		// Helicopter code goes here...
	}
	
}
