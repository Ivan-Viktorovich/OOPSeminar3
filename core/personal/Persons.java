package ru.gb.lessons.interfaces.core.personal;

import java.time.LocalDate;

public abstract class Persons {
    protected final String CLASS_NAME = getClass().getSimpleName();
    protected int id; //идентификатор для хранения в БД
    protected String fio; // ФИО
    protected LocalDate age; //дата рождения
    protected int kab; // кабинет

    public Persons() {
    }

    public Persons(int id, String fio, LocalDate age, int kab) {
        this.id = id;
        this.fio = fio;
        this.age = age;
        this.kab = kab;
    }

    public void dayWork() {
        startWork();
        dinner();
        endWork();
    }

    private void startWork() {
        System.out.println(CLASS_NAME + " Начал работу");
    }

    private void dinner() {
        System.out.println(CLASS_NAME + " Перерыв на обед");
    }

    private void endWork() {
        System.out.println(CLASS_NAME + " Закончил работу");
    }
    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public int getKab() {
        return kab;
    }

    public void setPost(int kab) {
        this.kab = kab;
    }

    @Override
        public String toString() {
            return CLASS_NAME + "{" +
                    "id=" + id +
                    ", fio='" + fio + '\'' +
                    ", age=" + age +
                    ", post=" + kab +
                    '}';
        }
    public String getClassName() {
        return this.CLASS_NAME;
    }    
}

