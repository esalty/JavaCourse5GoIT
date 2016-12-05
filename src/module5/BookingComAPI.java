package module5;

import java.util.GregorianCalendar;

/**
 * Created by GodMod on 11/30/2016.
 */
public class BookingComAPI extends AbstractAPI  {
    public BookingComAPI() {
        Room[] roomsSet = new Room[5];
        roomsSet[0] = new Room(4567483745L, 150, 2, new GregorianCalendar(2016,3,1), "Kozackiy", "Kyiv");
        roomsSet[1] = new Room(4567446375L, 500, 1,new GregorianCalendar(2016,3,1),  "Palace", "Kyiv");
        roomsSet[2] = new Room(1256446375L, 500, 1, new GregorianCalendar(2016,3,1),  "Kozackiy", "Kyiv");
        roomsSet[3] = new Room(2345643847L, 400, 2, new GregorianCalendar(2016,3,1),  "Palace", "Kyiv");
        roomsSet[4] = new Room(3281946375L, 300, 1, new GregorianCalendar(2016,3,1),  "Kozackiy", "Kyiv");
        this.rooms = roomsSet;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
