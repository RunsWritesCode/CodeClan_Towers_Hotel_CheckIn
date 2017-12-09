package Hotel;

public class Hotel {

    public String hotelName;
    public Integer hotelTill;


    public Hotel(String name, Integer hotelTill) {
        this.hotelName = name;
        this.hotelTill = hotelTill;
    }

    public Integer getHotelTill() {
        return hotelTill;
    }

    public void setHotelTill(Integer hotelTill) {
        this.hotelTill = hotelTill;
    }

    private int takePayment(double rate) {
        this.hotelTill = hotelTill + Rooms.Bedroom.getRate;
    }

}
