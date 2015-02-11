package org.usfirst.frc.team4099.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	public static int FRONT_LEFT_MOTOR = 0;
	public static int REAR_LEFT_MOTOR = 1;
	public static int FRONT_RIGHT_MOTOR = 2;
	public static int REAR_RIGHT_MOTOR = 3;
    public static int FRONT_SLIDE_MOTOR = 4;
    public static int REAR_SLIDE_MOTOR = 5;
}
