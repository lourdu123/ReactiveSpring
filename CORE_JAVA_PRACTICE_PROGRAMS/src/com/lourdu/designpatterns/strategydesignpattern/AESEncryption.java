package com.lourdu.designpatterns.strategydesignpattern;

public class AESEncryption implements Encryption {

    @Override
    public void encrypt(String message) {
        System.out.println("encrypting using AES Encryption...:" + message);

    }

}
