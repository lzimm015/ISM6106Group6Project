package edu.fiu.earthfi;

import java.util.ArrayList;
import java.util.List;

import edu.fiu.earthfi.util.ScenarioUtil;

/**
 * Represents a generic device that propagates the network. It can be implemented in different ways.
 * 
 * @see Buoy
 * @see Balloon
 */
public abstract class PropagatingDevice {

	private Double weight;
	private String size;
	private String color;
	private String material;
	
	private Envelope envelope;
	private Internet internet;
	private Payload payload;
	private GroundControlStation controlStation = new GroundControlStation();
	private Bus bus;
	private Transponder transponder = new Transponder();
	
	private List<PropagatingDevice> nearbyDevices;
	private List<User> systemUsers = new ArrayList<User>();
	
	public PropagatingDevice() {
		nearbyDevices = new ArrayList<PropagatingDevice>();
		systemUsers.add(new User());
		systemUsers.add(new User());
	}

	public void activate()  {
	}

	public void connectToGround()  {
	}

	public void getTelemetryStatus()  {
	}

	/**
	 * Sends a signal to the ground to propagate the network to users.
	 */
	public void sendSignalToGround()  {
		ScenarioUtil.printMessage("2.5 PropagatingDevice - Signal established");
		controlStation.receiveSignalFromDevice();
		ScenarioUtil.printMessage("2.7 PropagatingDevice - Data acknowledged");		
		systemUsers.get(0).connectToInternet();
		ScenarioUtil.printMessage("2.9 PropagatingDevice - Internet accessed", 1);
	}

	/**
	 * Receive a signal from the ground.
	 */
	public void receiveSignalFromGround()  {
		ScenarioUtil.printMessage("1.1 PropagatingDevice - Signal Received", 1);
	}

	/**
	 * Moves the device to the desired position
	 */
	public void moveToPosition()  {
		ScenarioUtil.printMessage("2.1 PropagatingDevice - Area clear for launch");
	}

	public void systemCheck()  {
	}

	/**
	 * Obtains nearby devices
	 */
	public void getNearbyDevices()  {
		nearbyDevices.add(new Balloon());
		nearbyDevices.add(new Buoy());
	}

	/**
	 * Propagates the network signal to other devices.
	 */
	public void propagateSignal()  {
		getNearbyDevices();
		ScenarioUtil.printMessage("2.3 PropagatingDevice - Signal is good");
		transponder.transferSignal(nearbyDevices.get(0));		
	}

	public void registerPropagatingDevice()  {
	}

	public void unregisterPropagatingDevice()  {
	}

	public void propagateDevicePowerOn()  {
	}

	public void propagateDevicePowerOff()  {
	}
	
	public abstract void decommission();
	
	public abstract String getType();

}
