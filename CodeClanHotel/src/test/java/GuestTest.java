import Guests.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class GuestTest {

    Guest guest1;
    Guest guest2;
    Guest guest;
    ArrayList<Guest> guests;

    @Before
    public void before() {
        guest1 = new Guest("JK", "Rowling", 1000.00);
        guests = new ArrayList<>();
        guests.add(guest1);
    }

    @Test
    public void canMakePayment() {

    }
}


