/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js09prakpbo;

/**
 * created by 21343065_PUTI ZAFANIA
 * @author cocaa
 */
public class Elevator {
    public boolean doorOpen = false;
        public int currentFloor = 5;
        public final int TOP_FLOOR = 5;
        public final int BOTTOM_FLOOR = 1;
        
        public void openDoor () {
            System.out.println("Opening door.");
            doorOpen = true;
            System.out.println("Door is.");
        }
        
        public void closeDoor () {
            System.out.println("Closing door.");
            doorOpen = false;
            System.out.println("Door is close.");
        }
        
        public void goUp(){
            System.out.println("GOing up one floor.");
            currentFloor++;
            System.out.println("Floor : " + currentFloor);
        }
               
        public void goDown(){
            System.out.println("GOing down one floor.");
            currentFloor--;
            System.out.println("Floor : " + currentFloor);
    }
        
        public void setFloor(int desiredFloor){
            while (currentFloor != desiredFloor) {
                if (currentFloor < desiredFloor) {
                    goUp();
                }
                else{
                    goDown();
                }
        }
}
        
        public int getFloor (){
            return currentFloor;
        }
        
        public boolean checkDoorStatus(){
            return doorOpen;
       }
    
}
