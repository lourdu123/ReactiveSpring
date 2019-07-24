package com.lourdu.designpatterns.statedesignpattern;

public class NoMoneyState implements VendingMachineState{

	@Override
	public void insertMoneyAndEnterProduct() {
		System.out.println("Money inserted.please wait...");
	}

	@Override
	public void dispenseProduct() {
		System.out.println("Cannot dispense product until you insert money");
		
	}
	
}
