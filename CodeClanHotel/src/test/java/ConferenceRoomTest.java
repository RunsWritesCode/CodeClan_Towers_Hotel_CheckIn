import Guests.Guest;
import Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests;

    @Before
    public void before() {
        guest1 = new Guest("JK", "Rowling", 1000.00);
        guests = new ArrayList<>();
        guests.add(guest1);
        conferenceRoom = new ConferenceRoom(40, guests, 150.00);
    }
        @Test
        public void canGetRate () {
            assertEquals(150.00, conferenceRoom.getRate(), 0.01);
        }


}
