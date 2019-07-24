package com.lourdu.designpatters.proxydesingpatter;

public class RealImage implements Image {

    private String fileName;

    // constructor
    public RealImage(String fileName) {
        // System.out.println("Real Image constructor");
        this.fileName = fileName;
        loadImage(fileName);

    }

    // a method that only the real image has
    private void loadImage(String fileName) {

        System.out.println("Real image loading");
    }

    @Override
    public void displayImage() {
        System.out.println("Real image displaying:" + fileName);
    }

}
