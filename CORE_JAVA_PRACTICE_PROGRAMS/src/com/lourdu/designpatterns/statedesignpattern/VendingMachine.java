package com.lourdu.designpatterns.statedesignpattern;

public class VendingMachine implements VendingMachineState{

	public VendingMachineState vendingMachineState;
	
	public VendingMachine(){
		vendingMachineState = new NoMoneyState();
	}

	public VendingMachineState getVendingMachineState() {
		return vendingMachineState;
	}

	public void setVendingMachineState(VendingMachineState vendingMachineState) {
		this.vendingMachineState = vendingMachineState;
	}

	@Override
	public void insertMoneyAndEnterProduct() {
		vendingMachineState.insertMoneyAndEnterProduct();
		
		if(vendingMachineState instanceof NoMoneyState){
			vendingMachineState = new HasMoneyState();
		}
	}

	@Override
	public void dispenseProduct() {
        vendingMachineState.dispenseProduct();
		
		if(vendingMachineState instanceof HasMoneyState){
			vendingMachineState = new NoMoneyState();
		}
	}
	
	
}
