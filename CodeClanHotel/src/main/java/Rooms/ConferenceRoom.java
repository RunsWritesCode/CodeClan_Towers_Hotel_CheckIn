package Rooms;

import Guests.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    double roomCost;

    public ConferenceRoom(Integer capacity, ArrayList<Guest> guests, double roomCost) {
        super(capacity);
        this.roomCost = roomCost;
    }
}
