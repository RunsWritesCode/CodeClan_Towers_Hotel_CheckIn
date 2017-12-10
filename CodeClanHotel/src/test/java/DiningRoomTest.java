import Guests.Guest;
import Rooms.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests;


    @Before
    public void before() {
        guest1 = new Guest("JK", "Rowling", 1000.00);
        guests = new ArrayList<>();
        guests.add(guest1);
        diningRoom = new DiningRoom(44, guests);

    }

    @Test
    public void canCheckAvailability() {
        assertEquals(44, diningRoom.checkAvailability());

    }


}
