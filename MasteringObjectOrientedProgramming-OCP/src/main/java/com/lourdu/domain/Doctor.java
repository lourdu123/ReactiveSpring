package com.lourdu.domain;

public class Doctor extends Employee {

    public Doctor(long id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("doctor in action");
    }

    @Override
    public void performDuties() {
        diagnosePatient();
        prescibeMedicine();
    }

    // Doctor
    public void diagnosePatient() {
        System.out.println("diagnose patient");
    }

    public void prescibeMedicine() {
        System.out.println("prescibing medicine");
    }

}
