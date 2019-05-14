package com.stackroute.springApplication.beans;

public class Movie {
    private String movieName;
    private String actorNAme;
    private String genre;

  Actor actor;
    public Movie() {

    }

    public Movie(String movieName, String actorNAme, String genre,Actor actor) {
        this.movieName = movieName;
        this.actorNAme = actorNAme;
        this.genre = genre;
        this.actor=actor;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActorNAme() {
        return actorNAme;
    }

    public void setActorNAme(String actorNAme) {
        this.actorNAme = actorNAme;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre= genre;
    }

    public  String welcomeMsg () {
        return "Welcome !!!";
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", actorNAme='" + actorNAme + '\'' +
                ", gender='" + genre + '\'' +
                ", actor=" + actor +
                '}';
    }

}
