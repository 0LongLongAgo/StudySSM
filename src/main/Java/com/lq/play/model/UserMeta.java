package com.lq.play.model;

import java.util.*;

/**
 * Created by lq on 2017/7/24.
 */
public class UserMeta {
    private Set axes;
    private Properties properties;
    private int num;
    private User user1;
    private List<String> arrayList;
    private Map<String, String> map;
    private String description;

    public UserMeta(Set axes, Properties properties, int num, User user1, List<String> arrayList, Map<String, String> map, String description) {
        this.axes = axes;
        this.properties = properties;
        this.num = num;
        this.user1 = user1;
        this.arrayList = arrayList;
        this.map = map;
        this.description = description;
    }

    public UserMeta() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setArrayList(List<String> arrayList) {
        this.arrayList = arrayList;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<String> getArrayList() {
        return arrayList;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Set getAxes() {
        return axes;
    }

    public void setAxes(Set axes) {
        this.axes = axes;
    }

    @Override
    public String toString() {
        return "UserMeta{" +
                "axes=" + axes.toString() + "\n" +
                ", properties=" + properties.toString() + "\n" +
                ", num=" + num + "\n" +
                ", user=" + user1 + "\n" +
                ", arrayList=" + arrayList.toString() + "\n" +
                ", map=" + map.toString() + "\n" +
                ", description='" + description + '\'' +
                '}';
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }
}
