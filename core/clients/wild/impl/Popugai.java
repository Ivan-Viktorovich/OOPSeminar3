package ru.gb.lessons.interfaces.core.clients.wild.impl;

import java.time.LocalDate;

import ru.gb.lessons.interfaces.core.clients.Flyable;
import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

public class Popugai extends WildAnimal implements Flyable, Runnable, Soundable {
    public Popugai(){
    }
    public Popugai(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }
    


    @Override
    public int sound() {
        System.out.println(CLASS_NAME + " Говорит, издавая шум: 65 дб");
        return 65;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " ходит со скоростью: 2 км/ч");
        return 2;
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + " летит со скоростью: 7 км/ч");
        return 7;
    }
    
}
