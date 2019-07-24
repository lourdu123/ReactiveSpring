package com.lourdu.domain;

public class Person {

    public static void main(String[] args) {

        RemoteControl remoteControl = RemoteControl.getRemoteControl();
        Device device = new TV();
        remoteControl.chooseDevice(device, OnOffType.ON);

        Device device1 = new Projector();
        remoteControl.chooseDevice(device1, OnOffType.OFF);

    }

}
