package com.lourdu.designpatters.proxydesingpatter;

public class Test {

    public static void main(String[] args) {

        ProxyImage proxy1 = new ProxyImage("test");

        proxy1.displayImage(); // loading necessary
        proxy1.displayImage(); // loading unnecessary
        proxy1.displayImage(); // loading unnecessary
    }

}
