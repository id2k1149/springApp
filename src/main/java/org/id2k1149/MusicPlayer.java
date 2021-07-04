package org.id2k1149;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private JazzMusic jazzMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic,
                       RockMusic rockMusic,
                       JazzMusic jazzMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.jazzMusic = jazzMusic;
    }

    public void playMusic(Genre genre) {
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        if (genre == Genre.CLASSICAL) {
            // случайная классическая песня
            System.out.println(classicalMusic.getSongs().get(randomNumber));
        } else if (genre == Genre.JAZZ) {
                System.out.println(jazzMusic.getSongs().get(randomNumber));
            } else {
            // случайная рок песня
            System.out.println(rockMusic.getSongs().get(randomNumber));
        }
    }
}
