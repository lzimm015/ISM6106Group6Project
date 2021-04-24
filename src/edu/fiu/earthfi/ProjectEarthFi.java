package edu.fiu.earthfi;

import edu.fiu.earthfi.util.ScenarioUtil;

/**
 * Main class for Project Earth-Fi. It is used to run the skeleton project code. 
 */
public class ProjectEarthFi {

	public static void main(String[] args) {
		new ProjectEarthFi().deviceBasicFlow();	
	}

	/**
	 * Performs the basic device workflow (same as the sequence diagram)
	 */
	private void deviceBasicFlow() {
		ScenarioUtil.printMessageWithDelay("Starting the basic device flow", 1);
		
		LTEAntenna antenna = new LTEAntenna();		
		antenna.sendSignal();
		
		TrafficController controller = new TrafficController();
		controller.organizeTraffic();
		
		controller.decommissionAll();
		
	}

}
