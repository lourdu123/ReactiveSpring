package com.lourdu.designpatterns.adapterdesignpattern;

public class MP4Player implements VideoPlayer {

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing mp4 song...");

    }

}
