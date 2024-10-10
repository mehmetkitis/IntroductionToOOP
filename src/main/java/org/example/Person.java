package org.example;

public class Person {
    String firstName;
    String lastName;
    String job;
    String country;
    String university;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String job, String country, String university) {
        this(firstName,lastName,age);
        this.job = job;
        this.country = country;
        this.university = university;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen(){
        if(age>=13 && age<19){
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }
    }

}
