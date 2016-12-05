package module5;

import java.util.GregorianCalendar;

/**
 * Created by GodMod on 11/30/2016.
 */
public class TripAdvisorAPI extends AbstractAPI{
    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public TripAdvisorAPI() {
        Room[] roomsSet = new Room[5];
        roomsSet[0] = new Room(3291874345L, 400, 1, new GregorianCalendar(2016,3,1), "Kozackiy", "Kyiv");
        roomsSet[1] = new Room(4567446375L, 200, 1, new GregorianCalendar(2016,3,1), "Palace", "Kyiv");
        roomsSet[2] = new Room(3988746375L, 600, 2, new GregorianCalendar(2016,3,1), "Kozackiy", "Kyiv");
        roomsSet[3] = new Room(4567449847L, 400, 2, new GregorianCalendar(2016,3,1), "Palace", "Kyiv");
        roomsSet[4] = new Room(5367946375L, 500, 1, new GregorianCalendar(2016,3,1), "Kozackiy", "Kyiv");
        this.rooms = roomsSet;
    }

}
