package Rooms;

import Guests.Guest;

import java.util.ArrayList;

public class DiningRoom extends Room {

    Integer capacity;

    public DiningRoom(Integer capacity, ArrayList<Guest> guests) {

        super(capacity);
        this.capacity = capacity;


    }

    public int checkAvailability() {
        return capacity;
    }
}
