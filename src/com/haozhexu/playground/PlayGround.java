package com.haozhexu.playground;

public class PlayGround {

    public static void main(String[] args) {
        PlayGround playGround = new PlayGround();
        playGround.test();

    }


    public void test() {
        System.out.println(getClass().getClassLoader());
    }
}
