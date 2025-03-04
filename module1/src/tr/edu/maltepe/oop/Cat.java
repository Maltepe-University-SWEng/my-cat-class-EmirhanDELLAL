package tr.edu.maltepe.oop;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Cat {
    public String name;
    public int age;
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;}
    public void setName(String name) {
        this.name = name;
        }

    public void setAge(int age) {
        this.age = age;
    }
public static void playMeowSound() {
try {
        File soundFile = new File("C:\\Users\\emiro\\Downloads\\Cat-meow-sound-effect.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);

        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        clip.start();

        Thread.sleep(clip.getMicrosecondLength() / 1000);
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
        e.printStackTrace();
    }
    }
}