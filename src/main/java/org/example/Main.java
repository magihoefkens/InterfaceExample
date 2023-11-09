package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MediaController mediaController=new MediaController();
        MusicPlayer musicPlayer= new MusicPlayer();
        VideoPlayer videoPlayer=new VideoPlayer();
        System.out.println(mediaController.playMedia(musicPlayer));
        System.out.println(mediaController.playMedia(videoPlayer));
        Playable testPlayer=new MusicPlayer();
        Playable testPlayer2=new VideoPlayer();
        System.out.println(testPlayer.play());
        System.out.println(testPlayer2.play());
        musicPlayer.say();
        


    }
}