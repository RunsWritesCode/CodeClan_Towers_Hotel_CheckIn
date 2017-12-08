package Rooms;

import Guests.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {

    private RoomType roomType;
    Integer roomNum;

    public Bedroom(String hotelName, Integer capacity, ArrayList<Guest> guests, RoomType roomType, Integer roomNum) {
        super(hotelName, capacity, guests);
        this.roomType = roomType;
        this.roomNum = roomNum;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Integer getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }
}
