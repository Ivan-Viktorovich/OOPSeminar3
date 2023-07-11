package ru.gb.lessons.interfaces.core.drugStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComponentIterator implements Iterator<Component>{
    List<Component> components = new ArrayList<>();
    int componentsCount = 0;
    @Override
    public boolean hasNext(){
        return componentsCount < components.size();
    }

    @Override
    public Component next() {
        return components.get(componentsCount++);
    }
}

