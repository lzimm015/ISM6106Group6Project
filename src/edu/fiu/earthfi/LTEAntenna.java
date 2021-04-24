package edu.fiu.earthfi;

import java.util.ArrayList;
import java.util.List;

import edu.fiu.earthfi.util.ScenarioUtil;

/**
 * LTE Signal Antenna in the ground, used to provide internet connectivity to the device network. 
 */
public class LTEAntenna {

	private String type;
	private Double frequency;
	private Double bandwidth;
	private LTECellTowerMain cellTowerMain;
	private List<PropagatingDevice> devices;
	
	public LTEAntenna() {
		devices = new ArrayList<PropagatingDevice>();
		devices.add(new Balloon());
		devices.add(new Buoy());
	}

	/**
	 * Send the signal to the devices
	 */
	public void sendSignal()  {
		ScenarioUtil.printMessage("1. LTEAntenna - Signal Sent");
		devices.get(0).receiveSignalFromGround();
	}

	public void systemcCheck()  {
	}

}
