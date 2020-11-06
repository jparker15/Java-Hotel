package com.careerdevs;

public class Room extends Floor{

    private boolean isOccupied = false;
    private String Occupant;
    private byte roomNumber;

    public Room (byte floorNumber,byte numberOfRooms, boolean isOccupied, String Occupant, byte roomNumber ) {
        super(floorNumber, numberOfRooms);
        this.isOccupied = isOccupied;
        this.Occupant = Occupant;
        this.roomNumber = roomNumber;


    }

    public void checkIn (){

    }

    public void checkOut (){

    }

}