package ru.gb.lessons.interfaces.core.drugStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy> {
    private List<Component> components;
    private int componentsCount;

    public Pharmacy() {
        this.components = new ArrayList<>();
        this.componentsCount = 0;
    }

    public Pharmacy addComponent(Component component) {
        this.components.add(component);
        this.componentsCount++;
        return this;
    }

    public List<Component> getComponents() {
        return components;
    }
    
    @Override
    public String toString(){
        return "Pharmacy{" +
                "components=" + components +
                ", index" + componentsCount +
                '}' + "total: " + getPower(this) + "\n";
    }

    @Override
    public Iterator<Component> iterator() {
        // return new Iterator<Component>(){
        //     @Override
        //     public boolean hasNext(){
        //         return componentsCount < components.size();
        //     }

        //     @Override
        //     public Component next() {
        //         return components.get(componentsCount++);
        //     }
        // };
        return new ComponentIterator();
    }

    @Override
    public int compareTo(Pharmacy o) {
        int pow1 = getPower(this);
        int pow2 = getPower(o);
        int n1 = getName(this);
        int n2 = getName(o);
        if(pow1 == pow2) return Integer.compare(pow1, pow2);
        else return Integer.compare(n1, n2);

        // if(pow1 > pow2) return 1;
        // else if (pow1 <pow2) return -1;
        // else return 0;
        
    }

    private int getName(Pharmacy pharm){
        int result = 0;
        for (Component elem: pharm.getComponents()){
            result += elem.getName();
        }
        return result;
    }
    
    private int getPower(Pharmacy pharm){
        int result = 0;
        for (Component elem: pharm.getComponents()){
            result += elem.getPower();
        }
        return result;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((components == null) ? 0 : components.hashCode());
        result = prime * result + componentsCount;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pharmacy other = (Pharmacy) obj;
        if (components == null) {
            if (other.components != null)
                return false;
        } else if (!components.equals(other.components))
            return false;
        if (componentsCount != other.componentsCount)
            return false;
        return true;
    }

    

    
    

    

}
