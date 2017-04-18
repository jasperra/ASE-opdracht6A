package org.joyofcoding.objectcalisthenics.domain;

/**
 * Created by Jasper on 18-Apr-17.
 */
public class Name {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Name(String name) {
        this.name = name;
    }

    public boolean checkName(String name){
        return this.name.equals(name);
    }
}
