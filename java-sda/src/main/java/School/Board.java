package School;

public class Board extends Furnishing{

    private BoardType bT;

    public Board (String name, int serialNumber, BoardType bT){
        super(name, serialNumber);
        this.bT = bT;
    }

    @Override
    public String toString() {
        return "Board [ " +
                getName() + ", " + getSerialNumber() +
                ", " + bT;
    }
}
