package com.bardizba.rockbandcatalog.Model;

import java.io.Serializable;

public class Song implements Serializable {
    private String title;
    private String spotify_uri;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSpotify_uri() {
        return spotify_uri;
    }

    public void setSpotify_uri(String spotify_uri) {
        this.spotify_uri = spotify_uri;
    }

    public Song() {
    }

    public Song(String title, String spotify_uri) {
        this.title = title;
        this.spotify_uri = spotify_uri;
    }
}
