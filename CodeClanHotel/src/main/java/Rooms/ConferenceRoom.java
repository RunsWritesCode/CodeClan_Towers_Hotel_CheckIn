package Rooms;

import Guests.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    double roomCost;

    public ConferenceRoom(String hotelName, Integer capacity, ArrayList<Guest> guests, double roomCost) {
        super(hotelName, capacity, guests);
        this.roomCost = roomCost;
    }
}
