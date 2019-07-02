/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amer.soap.dal.model;

import java.util.List;

public class Movie {

    private long id;
    private String name;
    private String desc;


    public Movie(long id, String name, String desc, List<Actor> actorList) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.actorList = actorList;
    }

    public List<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(List<Actor> actorList) {
        this.actorList = actorList;
    }

    private List<Actor> actorList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}