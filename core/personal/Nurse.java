package ru.gb.lessons.interfaces.core.personal;

import java.time.LocalDate;

public class Nurse extends Persons implements Persons1 {
    public Nurse() {
    } 
    public Nurse(int id, String fio, LocalDate age, int kab){
        super(id, fio, age, kab);
    }
}
