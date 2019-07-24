package com.corejava;

public class TestImplementsInterfaceXandY implements InterfaceX, InterfaceY {

    @Override
    public void y() {
        // TODO Auto-generated method stub

        System.out.println("Inside method y");

    }

    @Override
    public void x() {
        // TODO Auto-generated method stub
        System.out.println("Inside method x");
    }

    @Override
    public void m1() {
        // TODO Auto-generated method stub
        System.out.println("Inside method m1");
    }

    public static void main(String[] args) {

        TestImplementsInterfaceXandY tixy = new TestImplementsInterfaceXandY();

        tixy.x();
        tixy.y();
        tixy.m1();
    }

}
