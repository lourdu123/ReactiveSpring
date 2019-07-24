package com.lourdu.designpatterns.statedesignpattern;

public class HasMoneyState implements VendingMachineState{

	@Override
	public void insertMoneyAndEnterProduct() {
		System.out.println("Money is already inserted.Please wait while we are dispensing product");
	}

	@Override
	public void dispenseProduct() {
		System.out.println("dispensing the product.please wait.....");
		
	}

}
