package School;

import java.util.HashSet;
import java.util.Set;

public class Room {

    private int roomNumber;
    private int numberOfSpots;

    private  Set<Table> tables = new HashSet<>();
    private Set<Chair> chairs = new HashSet<>();
    private Board board;

    public Room (int roomNumber, int numberOfSpots){
        this.roomNumber = roomNumber;
        this.numberOfSpots = numberOfSpots;

    }
}
