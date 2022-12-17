package com.asashka.instagrama;

public class Post {
    private String profile;
    private String name;
    private String image;

    public Post(String profile, String name, String image) {
        this.profile = profile;
        this.name = name;
        this.image = image;
    }

    public String getProfile() {
        return profile;
    }



    public String getName() {
        return name;
    }



    public String getImage() {
        return image;
    }

}
