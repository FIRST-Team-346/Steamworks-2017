package org.usfirst.frc.team346.subsystem;

/**
 * This is the interface for all subsystem classes. This interface is used to
 * standardize all subsystems, which makes it easier when creating
 * new subsystems.
 * 
 * @author Adam Morrissett
 *
 */
public interface Subsystem {
	
	/**
	 * Publish necessary data about the subsystem overall
	 * or individual components within the subsystem. The
	 * actual data to be published depends on the particular
	 * implementation.
	 */
	public abstract void publishData();
}
