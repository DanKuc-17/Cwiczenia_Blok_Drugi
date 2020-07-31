package School;

public class Table extends Furnishing{

    public Table (String name, int serialNumber){
        super(name, serialNumber);
    }

    @Override
    public String toString() {
        return "Table [ " +
                getName() + ", " + getSerialNumber();
    }
}
