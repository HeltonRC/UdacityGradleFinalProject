package com.udacity.hrcosta.libjokes;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyJokesClass {

    private final List<String> jokes;
    private final Random random;

    public static MyJokesClass create() {
        return new MyJokesClass();
    }

    private MyJokesClass() {
        jokes = new ArrayList<>();
        jokes.add("Nobody goes to that restaurant anymore. It's too crowded");
        jokes.add("If doctors were like software engineers, they would say things like “Have you tried killing yourself and being reborn?”");
        jokes.add("Debugging is like being the detective in a crime drama where you are also the murderer.");
        jokes.add("Programming is like sex. One mistake and you have to support it for the rest of your life.");
        random = new Random();
    }

    public String getJoke() {
        return jokes.get(random.nextInt(jokes.size()));
    }


}
