package com.lourdu.designpatterns.strategydesignpattern;

public class BlowfishEncryption implements Encryption {

    @Override
    public void encrypt(String message) {
        System.out.println("Blowfish encryption...:" + message);

    }

}
