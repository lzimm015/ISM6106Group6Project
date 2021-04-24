package edu.fiu.earthfi;

import java.util.ArrayList;
import java.util.List;

import edu.fiu.earthfi.util.ScenarioUtil;

/**
 * Used to control the device traffic, both in the air and in the waters.
 */
public class TrafficController {

	private Object location;
	private List<PropagatingDevice> devices;
	
	public TrafficController() {
		devices = new ArrayList<PropagatingDevice>();
		devices.add(new Balloon());
		devices.add(new Buoy());
	}
	
	/**
	 * Organize traffic to prevent accidents and better propagate the signal.
	 */
	public void organizeTraffic()  {
		ScenarioUtil.printMessage("2. TrafficController - Air Traffic for baloon launch");
		devices.get(0).moveToPosition();
		
		ScenarioUtil.printMessage("2.2 TrafficController - Signal boosted");
		devices.get(0).propagateSignal();
		
	}
	
	public List<PropagatingDevice> getDevices() {
		return devices;
	}

	public void preventCollision()  {
	}

	/**
	 * Decommissions all existing devices.
	 */
	public void decommissionAll() {		
		for (PropagatingDevice device : devices) {
			ScenarioUtil.printMessage("3. TrafficController - Decomm signal, device type: " + device.getType());					
			device.decommission();
		}	
	}

}
