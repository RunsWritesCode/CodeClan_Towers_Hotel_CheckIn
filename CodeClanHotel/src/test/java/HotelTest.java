import Guests.Guest;
import Rooms.Bedroom;
import Rooms.Room;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;
import Hotel.Hotel;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Room room;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests;


    @Before
    public void before() {
        guest1 = new Guest("JK", "Rowling", 1000.00);
        guests = new ArrayList<>();
        guests.add(guest1);
        bedroom1 = new Bedroom(2, RoomType.DOUBLE,4, 44.00);
        hotel = new Hotel ("CodeClan Towers", 100);

    }

    @Test
    public void canAddGuestToRoom () {
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.countGuests());
    }

//    @Test
//    public int canTakePayment() {
//        bedroom1.getRate();
//        assertEquals(44, hotel.getHotelTill());
//
//    }

    @Test
    public void canCheckInGuest () {
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.countGuests());
    }


//    @Test
//    public void canCheckOutGuest () {
//        bedroom1.removeGuest(guest1);
//        this.takePayment(guest1);
//        assertEquals(0, bedroom1.countGuests());


//        assert that the hotel has taken payment
//    }



}
