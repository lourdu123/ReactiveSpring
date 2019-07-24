package com.lourdu.domain;

public abstract class ManufacturingProcess {

    private String name;

    public ManufacturingProcess(String name) {
        this.name = name;
    }

    public void manufacturingProcessOrder() {
        assembleUnits();
        testDevice();
        packDevice();
        storeDevice();
    }

    private void assembleUnits() {
        System.out.println("assembleUnits of " + name);
    }

    private void testDevice() {
        System.out.println("testDevice " + name);

    }

    private void packDevice() {
        System.out.println("packDevice " + name);

    }

    private void storeDevice() {
        System.out.println("storeDevice " + name);

    }

}
