package com.lourdu.designpatterns.commanddesignpattern;

public class CarStopCommand implements Command {
	
    private Car car;
	
	public CarStopCommand(Car car){
		this.car = car;
	}

	@Override
	public void execute() {
		car.stop();
	}

}
