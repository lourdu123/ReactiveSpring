package com.lourdu.designpatterns.strategydesignpattern;

public class EncryptionTest {

    public static void main(String[] args) {

        Encryption encryption = new AESEncryption();
        EncryptInformation ei = new EncryptInformation(encryption);
        ei.encryptGivenMessage("This is AES lurdu....");

        Encryption encryption1 = new BlowfishEncryption();
        EncryptInformation ei1 = new EncryptInformation(encryption1);
        ei1.encryptGivenMessage("This is blowfish lurdu....");
    }

}
