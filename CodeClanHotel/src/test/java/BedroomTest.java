import Guests.Guest;
import Rooms.Bedroom;
import Rooms.Room;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests;
    Room room1;

   @Before
    public void before(){
       guest1 = new Guest("JK", "Rowling", 1000.00);
       guests = new ArrayList<>();
       guests.add(guest1);
       room1 = new Room(1);
       bedroom1 = new Bedroom(2, RoomType.DOUBLE,4, 44.00 );
   }

    @Test
    public void canGetType() {
       assertEquals(RoomType.DOUBLE, bedroom1.getRoomType());
    }

    @Test
    public void canGetNum() {
       assertEquals(4, bedroom1.getRoomNum());
    }

    @Test
    public void canCheckRoomAvailable() {
       assertEquals(true, bedroom1.checkRoomAvailable());
    }

    @Test
    public void canGetRate() {
       assertEquals(44.00, bedroom1.getRate(), 0.01);
    }


}
