package School;

import java.util.Objects;

public abstract class Furnishing implements Comparable<Furnishing> {

    private String name;
    private int serialNumber;

    public Furnishing (String name, int serialNumber){
        this.name = name;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString(){
        return "Element of furnishing [ " +
                name + ", " + serialNumber;
    }

    public int compareTo (Furnishing furnishing){
        return name.compareTo(furnishing.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Furnishing that = (Furnishing) o;
        return serialNumber == that.serialNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }
}
