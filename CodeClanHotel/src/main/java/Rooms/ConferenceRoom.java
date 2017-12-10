package Rooms;

import Guests.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    double rate;

    public ConferenceRoom(Integer capacity, ArrayList<Guest> guests, double rate) {
        super(capacity);
        this.rate = rate;
    }

    public double getRate() {
        return this.rate;
    }
}
