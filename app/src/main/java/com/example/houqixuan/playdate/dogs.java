package com.example.houqixuan.playdate;

import com.backendless.BackendlessUser;

/**
 * Created by houqixuan on 5/21/16.
 */
public class dogs {
    private String weight;
    private BackendlessUser user;
    private String temperament;
    private String name;
    private String likes;
    private String levelofactivities;
    private String age;
    private String breed;

    public dogs(String w, String n, String b) {
        setBreed(b);
        setName(n);
        setWeight(w);

    }

    public String getWeight() {
        return weight;
    }

    public String getTemperament() {
        return temperament;
    }

    public String getName() {
        return name;
    }

    public String getLikes() {
        return likes;
    }

    public String getLevelofactivities() {
        return levelofactivities;
    }

    public String getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public BackendlessUser getUser() {
        return user;
    }

    public void setUser(BackendlessUser a) {
        user = a;
    }
    public void setWeight(String a) {
        weight = a;
    }
    public void setTemperament(String a) {
        temperament = a;
    }
    public void setName(String a) {
        name = a;
    }
    public void setLikes(String a) {
        likes = a;
    }
    public void setLevelofactivities(String a) {
        levelofactivities = a;
    }
    public void setAge(String a) {
        age = a;
    }
    public void setBreed(String a) {
        breed = a;
    }

}
