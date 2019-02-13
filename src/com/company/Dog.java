package com.company;
//All Dogs are Animals but all Animals are not Dogs


public class Dog extends Animal {
    public Dog() {
        //super();
        System.out.println("I am a dog!");
    }

    public String bark() {
        return "A dog barks loudly...";
    }

public String run() {
        return " A dog runs around the house...";
    }

public String sit() {
        return " A dog sits on the porch...";
    }

public String bathroom() {
        return "A dog uses the bathroom anyhwhere...";
    }

}
