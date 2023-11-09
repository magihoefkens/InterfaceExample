package org.example;

public class MusicPlayer implements Playable{

    @Override
    public String play() {
        return "Spiele Musik ab";
    }
    public void say(){
        System.out.println("Say hello!");
    }
}
