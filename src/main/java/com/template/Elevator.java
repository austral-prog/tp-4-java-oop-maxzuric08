package com.template;

public class Elevator {
    int actual_floor;
    int floor;
    int persons;
    int enter;
    public Elevator(int actual_floor, int floor, int persons) {
        this.actual_floor = actual_floor;
        this.floor = floor;
        this.persons = persons;
        this.enter = 0;
    }
    public void moveToFloor(int new_floor){
        if (new_floor<floor) {actual_floor += new_floor;}
    }
    public Integer getCurrentFloor(){
        return actual_floor;
    }
    public void addPassenger(){
        if (enter <persons){
        enter+=1;}
    }
    public void removePassenger(){
        if(enter>=1){
        enter-=1;}
    }
    public Integer getPassengerCount(){
        return enter;
    }

    // Implement this class by observing the tests in this repo. From those you will be able
    // to pick what the constructors params are, what the methods are and what they should do.


}
