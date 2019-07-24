package com.lourdu.designpatters.proxydesingpatter;

public class ProxyImage implements Image {

    private String fileName = null;
    
    // has a relationship
    private RealImage realImage = null;

    // constructor
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    // this method delegates to the real image
    public void displayImage() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
            realImage.displayImage();
        }
        else {
            // System.out.println("Proxy image displaying.");
            realImage.displayImage();
        }

    }

}
