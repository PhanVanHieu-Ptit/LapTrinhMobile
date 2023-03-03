package com.example.giuaky.model;

public class Tour {
    private  String name;
    private  int urlImage;

    public Tour(int urlImage,String name) {
        this.name = name;
        this.urlImage = urlImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(int urlImage) {
        this.urlImage = urlImage;
    }


}
