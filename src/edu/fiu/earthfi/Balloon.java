package edu.fiu.earthfi;

import edu.fiu.earthfi.util.ScenarioUtil;

/**
 * A concrete implementation of PropagatingDevice that floats in the air.
 */
public class Balloon extends PropagatingDevice {

	private Object windSensor;
	private Parachute parachute = new Parachute();

	public void detectWind()  {
	}
	
	/**
	 * Decomm the Baloon.
	 */
	public void decommission() {
		ScenarioUtil.printMessage("3.1 Baloon - Decomm done by parachute");
		parachute.deployParachute();
	}

	public String getType() {
		return "Balloon";
	}

}
