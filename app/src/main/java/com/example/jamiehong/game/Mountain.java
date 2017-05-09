package com.example.jamiehong.game;

/**
 * Created by jamiehong on 5/9/17.
 */

public class Mountain {
    private int height;
    private int frequency;

    public Mountain() {
        changeHeight();
        changeFrequency();

    }

    private void changeHeight() {
        height = (int) (Math.random() * 20);
    }

    private void changeFrequency() {
        frequency = (int) (Math.random() * 30);
    }

    public void draw(float[] mMVPMatrix) {
        // draw the mountain thing
    }
}
