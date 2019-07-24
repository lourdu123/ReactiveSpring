package com.lourdu.designpatterns.adapterdesignpattern;

public class MP3Player implements AudioPlayer {

	// has a relationship
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String mediaType, String fileName) {

        if (mediaType.equals("mp3")) {
            System.out.println("playing mp3 song..");
        }
        else if (mediaType.equals("mp4")) {
        	mediaAdapter = new MediaAdapter(mediaType);
        	mediaAdapter.play(mediaType, fileName);
        }
        else {
            System.out.println("unsupported media type..");
        }

    }

}
