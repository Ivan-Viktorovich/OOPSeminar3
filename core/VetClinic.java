package ru.gb.lessons.interfaces.core;

import java.util.ArrayList;
import java.util.List;

import ru.gb.lessons.interfaces.core.clients.Animal;
import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.clients.Flyable;
import ru.gb.lessons.interfaces.core.clients.Human;
import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.clients.home.impl.Cat;
import ru.gb.lessons.interfaces.core.clients.wild.impl.Duck;
import ru.gb.lessons.interfaces.core.clients.wild.impl.Popugai;
import ru.gb.lessons.interfaces.core.clients.wild.impl.Vidra;
import ru.gb.lessons.interfaces.core.clients.wild.impl.WildCat;

public class VetClinic {
    private static List<Animals> animals = new ArrayList<>(); 
    private static List<Animals> wildanimals = new ArrayList<>(); 


    public static void main(String[] args) {
        Human human = new Human("Пайтон");
        Cat cat = new Cat(0, null, 0, null, null);
        // animals.add(human);
        animals.add(cat);
        for (Animals element: animals) {
            heal((Animal) element);
        } 
        Duck duck = new Duck(0, 0, null, null);
        Popugai popugai = new Popugai(0, 0, null, null);
        Vidra vidra = new Vidra(0, 0, null, null);
        WildCat wildCat = new WildCat(0, 0, null, null);
        animals.add(duck);        
        animals.add(popugai);
        animals.add(vidra);           
        animals.add(wildCat);
        System.out.println(getFlyables() + " Летающие");
        System.out.println(getSwimable() + " Плавающие");
        System.out.println(getRunnable() + " Ходящие");
        System.out.println(getSoudable() + " Говорящие");
        
        
    }
    private static void heal(Animal patients) {
        System.out.println(patients.getClassName() + " вылечен");
    }

    public static List<Animal> getFlyables() {
        List<Animal> result = new ArrayList<>();
        for (Animals item: animals) {
            if (item instanceof Flyable) result.add((Animal) item);
        }
        return result;
    }
    
    public static List<Animal> getSwimable() {
        List<Animal> result = new ArrayList<>();
        for (Animals item: animals) {
            if (item instanceof Swimable) result.add((Animal) item);
        }
        return result;
    }
    public static List<Animal> getRunnable() {
        List<Animal> result = new ArrayList<>();
        for (Animals item: animals) {
            if (item instanceof Runnable) result.add((Animal) item);
        }
        return result;
    }
    public static List<Animal> getSoudable() {
        List<Animal> result = new ArrayList<>();
        for (Animals item: animals) {
            if (item instanceof Soundable) result.add((Animal) item);
        }
        return result;
    }
   
     
}

