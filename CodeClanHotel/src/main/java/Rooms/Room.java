package Rooms;

import Guests.Guest;
import Hotel.Hotel;

import java.util.ArrayList;

public class Room extends Hotel {

    public Integer capacity;
    private ArrayList<Guest> guests;

    public Room(String hotelName, Integer capacity, ArrayList<Guest> guests) {
        super(hotelName);
        this.capacity = capacity;
        this.guests = guests;
    }



    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }



}
