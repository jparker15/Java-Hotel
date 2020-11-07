package com.careerdevs;

import java.util.Scanner;

public class Room extends Floor{

    Scanner scanner = new Scanner(System.in);

    private boolean isOccupied = false;
    private String Occupant = scanner.nextLine();


    public Room (byte numberOfRooms, boolean isOccupied, String Occupant) {
        super(numberOfRooms);
        this.isOccupied = isOccupied;
        this.Occupant = Occupant;


    }

    public void getRooms(){}

    public void checkIn (){

        System.out.println("Enter name of the occupant: ");

    }

    public void checkOut (){

    }

}