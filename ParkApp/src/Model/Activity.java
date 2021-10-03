/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author meky
 */
public class Activity {
    private String name;
    private int capacity;
    private String description;
    private Timeslot timeslot;

    public Activity(String name, int capacity, String description, Timeslot timeslot) {
        this.name = name;
        this.capacity = capacity;
        this.description = description;
        this.timeslot = timeslot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timeslot getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(Timeslot timeslot) {
        this.timeslot = timeslot;
    }

    @Override
    public String toString() {
        return "Activity{" + "name=" + name + ", capacity=" + capacity + ", description=" + description + ", timeslot=" + timeslot + '}';
    }
    
    

    
    
}
