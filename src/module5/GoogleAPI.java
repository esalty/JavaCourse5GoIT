package module5;

import java.util.GregorianCalendar;

/**
 * Created by GodMod on 11/30/2016.
 */
public class GoogleAPI extends AbstractAPI {
    public GoogleAPI() {
        Room[] roomsSet = new Room[5];
        roomsSet[0] = new Room(3291874345L, 300, 1, new GregorianCalendar(2016,3,1), "Palace", "Kyiv");
        roomsSet[1] = new Room(4567446375L, 200, 1, new GregorianCalendar(2016,3,1),  "Kozackiy", "Kyiv");
        roomsSet[2] = new Room(3988746375L, 500, 2, new GregorianCalendar(2016,3,1),  "Palace", "Kyiv");
        roomsSet[3] = new Room(1118983847L, 350, 2, new GregorianCalendar(2016,3,1), "Kozackiy", "Kyiv");
        roomsSet[4] = new Room(3281946375L, 500, 1, new GregorianCalendar(2016,3,1),  "Palace", "Kyiv");
        this.rooms = roomsSet;

    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

}
