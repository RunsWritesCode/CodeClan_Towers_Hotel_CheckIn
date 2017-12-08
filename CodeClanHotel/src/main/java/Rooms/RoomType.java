package Rooms;

public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    DELUXE(2),


    private final int value;

    RoomType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
