package Rooms;

import Guests.Guest;

import java.util.ArrayList;

public class Room {

    private Integer capacity;
    private ArrayList<Guest> guests;

    public Room(Integer capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
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
