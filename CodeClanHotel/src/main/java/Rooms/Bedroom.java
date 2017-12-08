package Rooms;

import Guests.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {

    private RoomType roomType;
    Integer roomNum;
    ArrayList<Guest> guests;
    double rate;



    public Bedroom(Integer capacity, RoomType roomType, Integer roomNum, double rate) {
        super(capacity);
        this.roomType = roomType;
        this.roomNum = roomNum;
        this.guests = new ArrayList<>();
        this.rate = rate;

    }

    public double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getRoomNum() {
        return roomNum;
    }


    public void addGuest(Guest guest) {
        if( checkRoomAvailable() ) {
            this.guests.add(guest);
        }
    }

    public int countGuests() {
        return this.guests.size();
    }

    public boolean checkRoomAvailable() {
        if (this.guests.size() == 0) {
            return true;
        }else {
            return false;
        }
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }
}
