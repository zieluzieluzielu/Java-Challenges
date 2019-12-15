package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;
public class Main {

    public static  void main (String[] args) {
        MovieStore movieStore = new MovieStore();


        String moviesList = movieStore.getMovies().values().stream().map(Object::toString).map(Object::toString).collect(Collectors.joining("!")).replace("[", "").replace("]", "").replace(", ", "!");
        System.out.println(moviesList);
    }

}
