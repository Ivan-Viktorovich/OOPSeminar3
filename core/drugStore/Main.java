package ru.gb.lessons.interfaces.core.drugStore;

// import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
// import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy1 = new Pharmacy();
        Component comp1 = new Component("Penicillin", "10mg", 10); 
        Component comp2 = new Component("Spirit", "100mg", 1000);
        pharmacy1.addComponent(comp1).addComponent(comp2);

        // while (((Iterator<Component>) pharmacy1).hasNext()){
        //     System.out.println(pharmacy1.next());
        // }
        // System.out.println(pharmacy1);

        // DogFarmacy dogFarmacy = new DogFarmacy();

        // for (Component elem : pharmacy1) {
        //     System.out.println(elem);
        // }

        Pharmacy pharmacy2 = new Pharmacy();
        Component comp3 = new Component("Penicillin", "10mg", 14); 
        Component comp4 = new Component("Spirit", "100mg", 134);
        pharmacy2.addComponent(comp3).addComponent(comp4);
        Pharmacy pharmacy3 = new Pharmacy();
        Component comp5 = new Component("Pen", "10mg", 14); 
        Component comp6 = new Component("Spirit", "100mg", 134);
        pharmacy3.addComponent(comp5).addComponent(comp6);
        Pharmacy pharmacy4 = new Pharmacy();
        Component comp7 = new Component("Penicillin", "10mg", 10); 
        Component comp8 = new Component("Spirit", "100mg", 1000);
        pharmacy4.addComponent(comp7).addComponent(comp8);
        
        Set<Pharmacy> res = new HashSet<>();
        res.add(pharmacy1);
        res.add(pharmacy2);
        res.add(pharmacy3);
        res.add(pharmacy4);
        System.out.println("-----------------------------------------------------------1ая часть ДЗ-------------------------------------------------------------------------------");
        // Переоределил методы equals & hashCode в классах Component & Pharmacy, теперь достаточно поменять одну букву или цифру и значение станет уникальным
        System.out.println(res);

        // Serializable - интерфейс отвечающий за превращение объекта в набор байтов,для обратного превращения используется Deserialasable

        List<Pharmacy> nomenclature = new ArrayList<>();
        nomenclature.add(pharmacy3);
        nomenclature.add(pharmacy2);
        nomenclature.add(pharmacy4);
        nomenclature.add(pharmacy1);
        System.out.println("------------------------------------------------------------------------2ая часть ДЗ------------------------------------------------------------------");
        // В классе Component и Pharmacy добавил методы getName по примеру getPower, только получая длину строки и добавил все в метод compareTo
        Collections.sort(nomenclature);
        System.out.println(nomenclature);
    }

   
}
