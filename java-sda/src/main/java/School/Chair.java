package School;

public class Chair extends Furnishing{

    public Chair (String name, int serialNumber) {
        super(name, serialNumber);
    }

    @Override
    public String toString() {
        return "Chair [ " +
                getName() + ", " + getSerialNumber();
    }
}
