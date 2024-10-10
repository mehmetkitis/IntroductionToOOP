package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 18);
        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("IsAdult: " + person.isTeen());
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        System.out.println("setHeight= " + wall.setHeight(-10));
    }
}
