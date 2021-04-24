package edu.fiu.earthfi;

import edu.fiu.earthfi.util.ScenarioUtil;

/**
 * A concrete implementation of PropagatingDevice that floats in water.
 */
public class Buoy extends PropagatingDevice {

	private Object waveSensor;

	public void detectWaterTurbulence()  {
	}

	/**
	 * Decomission the buoy
	 */
	public void decommission() {
		ScenarioUtil.printMessage("3.1 Buoy - Decomm done by sinking");	
	}

	public String getType() {
		return "Buoy";
	}

}
