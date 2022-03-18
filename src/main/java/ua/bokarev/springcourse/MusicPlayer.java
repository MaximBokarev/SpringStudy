package ua.bokarev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        }

    public void playMusic(Genre genre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        if(genre == Genre.CLASSICAL){
            System.out.println(classicalMusic.getTracks().get(randomNumber));
        }else
            System.out.println(rockMusic.getTracks().get(randomNumber));
        }
}
