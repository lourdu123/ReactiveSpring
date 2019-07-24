package com.lourdu.designpatterns.adapterdesignpattern;

public class MediaAdapter implements AudioPlayer {

	// has a relationship
    VideoPlayer vp;

    public MediaAdapter(String type) {
    	vp = new MP4Player();
    }

    @Override
    public void play(String mediaType, String fileName) {
    	vp.playMP4(fileName);
    }

}
