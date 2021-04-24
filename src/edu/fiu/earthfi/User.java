package edu.fiu.earthfi;

import edu.fiu.earthfi.util.ScenarioUtil;

/**
 * A representation of a customer/user of the network.
 */
public class User {

	private String location;
	private Integer age;
	private Object mobileDevice;
	private Internet internet;

	/**
	 * Receives internet signal.
	 */
	public void connectToInternet()  {
		ScenarioUtil.printMessageWithDelay("2.8 User - Internet data sent");
	}

}
