package org.usfirst.frc.team346.autonomous;

/**
 * This is the interface for all of the autonomous modes. This interface
 * creates a "contract" with implementing classes. These implementing
 * classes essentially agree to provide the methods listed in this 
 * interface, which makes it easier creating boilerplate code for 
 * choosing an autonomous mode. 
 * 
 * @author Adam Morrissett
 *
 */
public interface Autonomous {
	
	/**
	 * This is the initialization method for each autonomous
	 * class. 
	 */
	public abstract void init();
	
	/**
	 * This method should start the autonomous logic.
	 */
	public abstract void start();
}
