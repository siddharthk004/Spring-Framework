package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
    private List<String> friends1;
    private Set<String> friends2;
    private Map<String, String> friends3;
    private Properties friends4;

    // Getters and Setters

    public List<String> getFriends1() {
        return friends1;
    }

    public void setFriends1(List<String> friends1) {
        this.friends1 = friends1;
    }

    public Set<String> getFriends2() {
        return friends2;
    } 

    public void setFriends2(Set<String> friends2) {
        this.friends2 = friends2;
    }

    public Map<String, String> getFriends3() {
        return friends3;
    }

    public void setFriends3(Map<String, String> friends3) {
        this.friends3 = friends3;
    }

    public Properties getFriends4() {
        return friends4;
    }

    public void setFriends4(Properties friends4) {
        this.friends4 = friends4;
    }

    @Override
    public String toString() {
        return "Person{" +
                "\nfriends1=" + friends1 +
                ", \nfriends2=" + friends2 +
                ", \nfriends3=" + friends3 +
                ", \nfriends4=" + friends4 +
                '}';
    }
}
