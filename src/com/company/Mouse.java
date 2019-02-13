package com.company;
////All Mice  are Animals but all Animals are not Mice

public class Mouse extends Animal {

public Mouse() {
    //super
    System.out.println(" I am a mouse");
}

public String squeal() {
    return " I squeal all the time";
}

public String tail() {
    return "My tail moves while I squeal";
}

public String move() {
    return "I am always on the move";
}

}