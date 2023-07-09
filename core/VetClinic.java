package ru.gb.lessons.interfaces.core;

import java.util.ArrayList;
import java.util.List;

import ru.gb.lessons.interfaces.core.clients.Animal;
import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.clients.Flyable;
import ru.gb.lessons.interfaces.core.clients.Human;
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
            heal(element);
        } 
        Duck duck = new Duck(0, 0, null, null);
        Popugai popugai = new Popugai(0, 0, null, null);
        Vidra vidra = new Vidra(0, 0, null, null);
        WildCat wildCat = new WildCat(0, 0, null, null);
        wildanimals.add(duck);        
        wildanimals.add(popugai);
        wildanimals.add(vidra);           
        wildanimals.add(wildCat);
        for (Animals element: wildanimals) { 
            fly((Flyable) element); 
        }
        
        
    }
    private static void heal(Animals patients) {
        System.out.println(patients.getClassName() + " вылечен");
    }
    private static void fly(Flyable patients) {
        System.out.println(patients.getClassName() + " летает"); 
    } 
    private static void run(Runnable patients) {
        System.out.println(((Animal) patients).getClassName() + " ходит"); 
    } 
    private static void swim(Swimable patients) {
        System.out.println(((Animal) patients).getClassName() + " плавает"); 
    } 
    private static void sound(Soundable patients) {
        System.out.println(((Animal) patients).getClassName() + " говорит"); 
    } 
   
     
}

