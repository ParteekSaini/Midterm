package com.example.democlass5.Model;

import org.springframework.beans.factory.annotation.Autowired;

public class Model {

    private String joke;

    @Autowired
     private RandomJokes randomJokes;


    public Model(RandomJokes randomJokes ) {

        this.joke = randomJokes.getRandomJokes();
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        joke = randomJokes.getRandomJokes();
        this.joke = joke;
    }

    @Override
    public String toString() {
        return "Model{" +
                "joke='" + joke + '\'' +
                '}';
    }
}
