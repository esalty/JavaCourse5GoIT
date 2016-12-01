package module5;

/**
 * Created by GodMod on 11/28/2016.
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);

   Room[] getRooms();


}
