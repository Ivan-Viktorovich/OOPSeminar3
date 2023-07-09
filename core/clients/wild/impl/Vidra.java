package ru.gb.lessons.interfaces.core.clients.wild.impl;

import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;
import java.time.LocalDate;
import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;


public class Vidra extends WildAnimal implements Runnable, Swimable {
    public Vidra(){
    }
    public Vidra(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + " плавает со скоростью 10 км/ч");
        return 10;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " ходит со скоростью: 12 км/ч");
        return 12;
    }
    
}
