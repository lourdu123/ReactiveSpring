package com.lourdu.designpatterns.statedesignpattern;

public class Test {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		
		System.out.println(vm.getVendingMachineState());
		
		vm.dispenseProduct();
		vm.insertMoneyAndEnterProduct();
		
		System.out.println(vm.getVendingMachineState());
		
		
		vm.insertMoneyAndEnterProduct();
		vm.dispenseProduct();
		
		System.out.println(vm.getVendingMachineState());
	}
}
