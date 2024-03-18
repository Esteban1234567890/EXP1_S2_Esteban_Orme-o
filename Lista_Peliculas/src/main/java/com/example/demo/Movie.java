package com.example.demo;
 
public class Movie {
    private int id;
    private String name;
    private int year;
    private String director;
    private String gen;
    private String description;

    public Movie(int id, String name, int year, String director, String gen, String description ) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.director = director;
        this.gen = gen;
        this.description = description;
    }

    //Getters @
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public String getGen() {
        return gen;
    }

    public String getDescription() {
        return description;
    }
    
}
