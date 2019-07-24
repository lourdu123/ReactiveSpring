package com.lourdu.designpatterns.strategydesignpattern;

public class EncryptInformation {

    private Encryption encryption;

    public EncryptInformation(Encryption encryption) {
        this.encryption = encryption;
    };

    public void encryptGivenMessage(String message) {
        encryption.encrypt(message);
    }

}
