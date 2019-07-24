package com.lourdu.domain;

public class RemoteControl {

    private static RemoteControl remoteControl;

    private RemoteControl() {

    }

    public static RemoteControl getRemoteControl() {

        synchronized(RemoteControl.class) {
            if (remoteControl == null) {
                remoteControl = new RemoteControl();
            }
        }

        return remoteControl;
    }

    public RemoteControl clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public static void chooseDevice(Device device, OnOffType type) {

        switch (type) {
            case ON:
                turnOnDevice(device);
                break;
            case OFF:
                turnOffDevice(device);
                break;
        }
    }

    public static void turnOnDevice(Device device) {
        device.on();
    }

    public static void turnOffDevice(Device device) {
        device.off();
    }

}
