package edu.fiu.earthfi;

import edu.fiu.earthfi.util.ScenarioUtil;

/**
 * Represents a parachute, part of the air devices.
 */
public class Parachute {

	private String material;
	private String size;
	private String type;

	/**
	 * Deploy the parachute mechanism.
	 */
	public void deployParachute()  {
		ScenarioUtil.printMessage("3.1.1 Parachute - Decomm done by parachute");
	}

}
