/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;






public class ParkingSlot {
    private int id;               // Unique identifier for the parking slot
    private String slotName;      // Name or identifier for the parking slot (e.g., "A1", "B2")
    private String location;      // Location of the parking slot (e.g., "Downtown", "Parking Lot 1")
    private boolean availability; // Indicates whether the slot is available or booked

    // Constructor to initialize the ParkingSlot object
    public ParkingSlot(int id, String slotName, String location, boolean availability) {
        this.id = id;
        this.slotName = slotName;
        this.location = location;
        this.availability = availability;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for slot name
    public String getSlotName() {
        return slotName;
    }

    // Setter for slot name
    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    // Getter for location
    public String getLocation() {
        return location;
    }

    // Setter for location
    public void setLocation(String location) {
        this.location = location;
    }

    // Getter for availability
    public boolean isAvailability() {
        return availability;
    }

    // Setter for availability
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    // Optional: Override toString() for easy debugging
    @Override
    public String toString() {
        return "ParkingSlot [id=" + id + ", slotName=" + slotName + ", location=" + location + ", availability=" + availability + "]";
    }
}

  

