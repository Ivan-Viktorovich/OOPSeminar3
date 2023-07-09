package ru.gb.lessons.interfaces.core.personal;

import java.time.LocalDate;

public class Doctor extends Persons implements Persons1 {
    public Doctor() {
    } 
    public Doctor(int id, String fio, LocalDate age, int kab){
        super(id, fio, age, kab);
    }

}
    

