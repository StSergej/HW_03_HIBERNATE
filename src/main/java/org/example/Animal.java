package org.example;


import javax.persistence.*;

@Entity
@Table(name = "Animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;
    private boolean tail;

    public Animal() { }

    public Animal( String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal( String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Animal {id = " + id + ", age = " + age +
                ", name = " + name + ", tail = " + tail + "}";
    }
}
