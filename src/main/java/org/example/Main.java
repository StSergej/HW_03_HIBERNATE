/*  Создать новую базу данных с помощью MySQLWorkbench.
    Создать файл с настройками hibernate.cfg.xml.
    И создать класс Animal(int age, String name, boolean tail) с методами get и set,
    как сущность к нашей таблице.
    И с помощью hibernate создать новую таблицу с начальным значением.
 */
package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("cat", 3, true);
        Animal animal1 = new Animal("dog", 7, true);

        List<Animal> animals =  new ArrayList<Animal>();

        animals.add(new Animal("lion", 12));
        animals.add(new Animal("bear", 10));
        animals.add(new Animal("elephant", 25));

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(animal);
        session.save(animal1);
        for(Animal beast : animals){
            session.save(beast);
        }

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

        String pet = animal.toString();
        System.out.println("\n" + pet);

    }
}
