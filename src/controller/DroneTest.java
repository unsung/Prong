package controller;

import de.yadrone.base.ARDrone;

public class DroneTest {

	public static void main(String [] args){
	ARDrone Drone = new ARDrone("192.168.1.1");
	
	Drone.start();
	Drone.takeOff();
	Drone.hover();
	
	}
	
	
}
