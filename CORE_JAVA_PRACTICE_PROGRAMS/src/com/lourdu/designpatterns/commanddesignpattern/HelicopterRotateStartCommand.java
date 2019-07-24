package com.lourdu.designpatterns.commanddesignpattern;

public class HelicopterRotateStartCommand implements Command {

   private Helicopter helicopter;
	
	public HelicopterRotateStartCommand(Helicopter helicopter){
		this.helicopter = helicopter;
	}

	@Override
	public void execute() {
		helicopter.rotateTop();
	}

}
