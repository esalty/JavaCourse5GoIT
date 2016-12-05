package module5;

/**
 * Created by GodMod on 12/1/2016.
 */
public class AbstractAPI implements API {
    public Room[] rooms;


    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] roomsFound = new Room[5];
        Room[] apiRooms = getRooms();

        int roomsPrice;
        int roomsPersons;
        String roomsCity;
        String roomsHotel;

        int searchCounter = 0;
        for (int i = 0; i < apiRooms.length; i++) {

            roomsPrice = apiRooms[i].getPrice();
            roomsPersons = apiRooms[i].getPersons();
            roomsCity = apiRooms[i].getCityName();
            roomsHotel = apiRooms[i].getHotelName();

            if (price == roomsPrice && persons == roomsPersons &&
                    city.equals(roomsCity) && hotel.equals(roomsHotel)) {

                roomsFound[searchCounter] = apiRooms[i];
                searchCounter++;
            }
        }
        return roomsFound;
    }

    public Room[] getRooms() {
        return rooms;
    }
}

