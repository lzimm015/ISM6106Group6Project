package edu.fiu.earthfi;

/**
 * A concrete implementation of PropagatingDevice that floats in the air.
 */
public class Balloon extends PropagatingDevice {

	private Object windSensor;
	private Parachute parachute = new Parachute();

	public void detectWind()  {
	}
	
	public void decommission() {
		parachute.deployParachute();
	}

	public String getType() {
		return "Balloon";
	}

}
