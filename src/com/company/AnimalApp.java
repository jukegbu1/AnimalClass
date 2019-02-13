package com.company;
public class AnimalApp {

    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());


        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());

        Dog d= new Dog();
        print(d.bark());
        print(d.bathroom());
        print(d.run());
        print(d.sit());

        Mouse m= new Mouse();
        print(m.move());
        print(m.squeal());
        print(m.tail());
    }

    private static void print(String s) {
        System.out.println(s);
    }
}