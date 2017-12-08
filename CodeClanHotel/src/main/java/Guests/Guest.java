package Guests;

import java.util.ArrayList;

public class Guest {

    public String firstName;
    public String lastName;
    public double wallet;
    ArrayList<Guest> guests;

    public Guest(String firstName, String lastName, double wallet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.wallet = wallet;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public void add(Guest guest) {
        this.guests.add(guest);
    }




}
