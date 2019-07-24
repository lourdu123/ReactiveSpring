package com.lourdu.domain;

public class Nurse extends Employee {

    public Nurse(long id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse in action");
    }

    @Override
    public void performDuties() {
        checkVitals();
        drawBlood();
    }

    // Nurse
    public void checkVitals() {
        System.out.println("checking vitals");
    }

    public void drawBlood() {
        System.out.println("drawing blood");
    }

}
