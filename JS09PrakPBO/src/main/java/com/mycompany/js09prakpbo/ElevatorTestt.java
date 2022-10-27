/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js09prakpbo;

/**
 * created by 21343065_PUTI ZAFANIA
 * @author cocaa
 */
public class ElevatorTestt {
    public static void main(String []args){
        Elevator myElevator = new Elevator();
        myElevator.openDoor ();
        myElevator.closeDoor ();
        myElevator.goUp ();
        myElevator.goUp ();
        myElevator.goUp ();
        myElevator.openDoor ();
        myElevator.closeDoor ();
        myElevator.goDown ();
        myElevator.openDoor ();
        myElevator.closeDoor ();
        myElevator.goDown ();
        myElevator.setFloor (myElevator.TOP_FLOOR);
        myElevator.openDoor ();
    }
}
