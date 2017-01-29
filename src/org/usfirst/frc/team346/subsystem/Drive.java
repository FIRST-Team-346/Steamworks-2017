package org.usfirst.frc.team346.subsystem;

import org.usfirst.frc.team346.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 * This is the drive subsystem. This class is responsible for
 * everything that makes the robot move.
 * 
 * @author Adam Morrissett
 *
 */
public class Drive implements Subsystem {
	
	/**
	 * Enumeration for the drive modes for the drive base.
	 * @author Adam Morrissett
	 *
	 */
	private enum DriveMode {
		TANK,		///< Standard tank drive
		AUTONOMOUS;	///< Autonomous magnitude and curve driving
	}

	// CANTalon declarations
	private CANTalon m_leftDriveMaster;
	private CANTalon m_leftDriveSlave;
	private CANTalon m_rightDriveMaster;
	private CANTalon m_rightDriveSlave;
	
	// Solenoid declaration
	private DoubleSolenoid m_transmissionSolenoid;
	
	// RobotDrive declaration
	private RobotDrive m_robotDrive;	
	
	/**
	 * Default constructor for Drive class.
	 */
	public Drive() {
		this.initLeftSide();
		this.initRightSide();
		
		this.m_robotDrive = new RobotDrive(this.m_leftDriveMaster,
				this.m_leftDriveSlave, this.m_rightDriveMaster,
				this.m_rightDriveSlave);
	}
	
	/**
	 * Initializes the left side of the robot drive. This
	 * method configures all of the CANTalons.
	 * 
	 */
	private void initLeftSide() {
		this.m_leftDriveMaster = new CANTalon(RobotMap.LEFT_DRIVE_MASTER_PORT);
		this.m_leftDriveSlave = new CANTalon(RobotMap.LEFT_DRIVE_SLAVE_PORT);
	}
	
	/**
	 * Initializes the right side of the robot drive. This
	 * method configures all of the CANTalon.
	 */
	private void initRightSide() {
		this.m_rightDriveMaster = new CANTalon(RobotMap.RIGHT_DRIVE_MASTER_PORT);
		this.m_rightDriveSlave = new CANTalon(RobotMap.RIGHT_DRIVE_SLAVE_PORT);
	}
	
	/**
	 * Set the magnitude and the curve of the robot. The magnitude
	 * is how fast it moves in rotations per minute (RPMs). The
	 * curve is the arch of the travel path.
	 * 
	 * @param _magnitude magnitude of robot output. From -1 to 1
	 * @param _curve arch of the travel path. From -1 to 1. -1 is 
	 * full left, and 1 is full right.  
	 */
	public void set(double _magnitude, double _curve) {
		this.m_robotDrive.drive(_magnitude, _curve);
	}
	
	/**
	 * Sets the speed of the robot to either high (true) or low
	 * (false) speed. NOT IMPLEMENTED YET
	 *  
	 * @param _value high (true) or low (false) speed.
	 */
	public void setHighSpeed(final boolean _value) {
		return;
	}
	
	/**
	 * Publish information about the Drive class to the 
	 * SmartDashboard. This information is typically 
	 * component values such as motor speed, limit switch
	 * values, or internal states of the class.
	 */
	@Override
	public void publishData() {
		// TODO Auto-generated method stub
		
	}

}
