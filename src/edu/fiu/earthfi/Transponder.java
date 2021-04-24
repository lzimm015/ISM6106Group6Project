package edu.fiu.earthfi;

import edu.fiu.earthfi.util.ScenarioUtil;

/**
 * A component used to transmit network signals.
 */
public class Transponder {

	private String type;
	private Double frequency;

	public void locateDevice()  {
	}

	/**
	 * Allows the device to propagate the signal.
	 */
	public void transferSignal(PropagatingDevice propagatingDevice) {
		ScenarioUtil.printMessageWithDelay("2.4 Transponder - Signal Transferred");
		propagatingDevice.sendSignalToGround();		
	}

}
