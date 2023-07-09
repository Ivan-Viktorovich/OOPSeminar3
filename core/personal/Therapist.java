package ru.gb.lessons.interfaces.core.personal;

import java.time.LocalDate;

public class Therapist extends Persons implements Persons1 {
    public Therapist() {
    } 
    public Therapist(int id, String fio, LocalDate age, int kab){
        super(id, fio, age, kab);
    }
}