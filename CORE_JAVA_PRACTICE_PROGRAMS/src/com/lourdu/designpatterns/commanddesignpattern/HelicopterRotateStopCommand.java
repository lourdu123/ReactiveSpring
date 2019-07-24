package com.lourdu.designpatterns.commanddesignpattern;

public class HelicopterRotateStopCommand implements Command {

	 private Helicopter helicopter;
		
		public HelicopterRotateStopCommand(Helicopter helicopter){
			this.helicopter = helicopter;
		}

		@Override
		public void execute() {
			helicopter.rotateTopStop();
		}

}
