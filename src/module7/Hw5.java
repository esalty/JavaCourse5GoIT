package module7;

import module5.Room;

import java.util.ArrayList;

import java.util.GregorianCalendar;
import java.util.List;


public class Hw5 {
    public static void main(String[] args) {
        List<Room> bookingRooms = new ArrayList<>();
        List<Room> googleRooms = new ArrayList<>();
        List<Room> tripRooms = new ArrayList<>();

        bookingRooms.add(new Room(10, 200, 2, new GregorianCalendar(), "Hilton", "Kiev"));
        bookingRooms.add(new Room(11, 300, 3, new GregorianCalendar(), "Marcus Marriott", "New York"));
        bookingRooms.add(new Room(12, 500, 2, new GregorianCalendar(), "Caesars Palace", "LasVegas"));
        bookingRooms.add(new Room(13, 600, 1, new GregorianCalendar(), "Hotel Vienna", "Vienna"));
        bookingRooms.add(new Room(19, 9000, 2, new GregorianCalendar(), "Rosa Grand", "Milan"));

        googleRooms.add(new Room(15, 1000, 2, new GregorianCalendar(), "Hilton", "Paris"));
        googleRooms.add(new Room(16, 3000, 3, new GregorianCalendar(), "Holiday inn", "Miami"));
        googleRooms.add(new Room(17, 5000, 2, new GregorianCalendar(), "Four Seasons", "Moscow"));
        googleRooms.add(new Room(18, 6100, 1, new GregorianCalendar(), "Bellagio", "LasVegas"));
        googleRooms.add(new Room(19, 9000, 2, new GregorianCalendar(), "Rosa Grand", "Milan"));

        tripRooms.add(new Room(10, 200, 2, new GregorianCalendar(), "Hotel", "City"));
        tripRooms.add(new Room(11, 300, 3, new GregorianCalendar(), "Hotel", "City"));
        tripRooms.add(new Room(12, 500, 2, new GregorianCalendar(), "Hotel", "City"));
        tripRooms.add(new Room(13, 600, 1, new GregorianCalendar(), "Hotel", "City"));
        tripRooms.add(new Room(19, 9000, 2, new GregorianCalendar(),"Hotel", "City"));
    }
}
