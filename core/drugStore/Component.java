package ru.gb.lessons.interfaces.core.drugStore;

public class Component {
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }
    
    @Override
    public String toString(){
        return "Component{" + 
        "name=" + name + '\'' +
        ", weight='" + weight + '\'' +
        ", power" + power +
        '}';
    }

    public int getName() {
        return this.name.length();
    }

    public int getPower() {
        return this.power;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((weight == null) ? 0 : weight.hashCode());
        result = prime * result + power;
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
        Component other = (Component) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (weight == null) {
            if (other.weight != null)
                return false;
        } else if (!weight.equals(other.weight))
            return false;
        if (power != other.power)
            return false;
        return true;
    }
    

    
}
