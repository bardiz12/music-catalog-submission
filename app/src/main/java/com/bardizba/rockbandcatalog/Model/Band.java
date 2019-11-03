package com.bardizba.rockbandcatalog.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Band implements Serializable {
    private String name;
    private String[] genre;
    private String label;
    private String city_nick;
    private String city_full;
//    private String[] best_songs;
    //private String[] spotify;
    private ArrayList<Song> best_songs;
    private String article;
    private int imgPhoto = -1;

    public Band() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getGenre() {
        return genre;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCity_nick() {
        return city_nick;
    }

    public void setCity_nick(String city_nick) {
        this.city_nick = city_nick;
    }

    public String getCity_full() {
        return city_full;
    }

    public void setCity_full(String city_full) {
        this.city_full = city_full;
    }

    public ArrayList<Song> getBest_songs() {
        return best_songs;
    }

    public void setBest_songs(ArrayList<Song> best_songs) {
        this.best_songs = best_songs;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public int getImgPhoto() {
        return imgPhoto;
    }

    public void setImgPhoto(int imgPhoto) {
        this.imgPhoto = imgPhoto;
    }
}
