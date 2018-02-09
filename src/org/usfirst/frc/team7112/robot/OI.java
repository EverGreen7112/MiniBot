package org.usfirst.frc.team7112.robot;

import edu.wpi.first.wpilibj.buttons.Button;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public Joystick DrivingJS = new Joystick(0);
	Button buttonTrigger = new JoystickButton(DrivingJS, 1);
	Button buttonThumb = new JoystickButton(DrivingJS, 2);

	private static OI instance;
	
	public Button GetButtonTrigger(){
		return buttonTrigger;
	}
	
	public Button GetButtonThumb(){
		return buttonThumb;
	}
	
	public double GetXAxis() {
		return DrivingJS.getRawAxis(0);
	}
	
	public double GetYAxis() {
		return DrivingJS.getRawAxis(1);
	}
	
	public double GetRotateAxix(){
		return DrivingJS.getRawAxis(2);
	}
	
	public double GetSliderAxis(){
		return DrivingJS.getRawAxis(3);
	}
	
	public int GetPOV(){
		return DrivingJS.getPOV(0);
	}
	
	public static final OI getInstance() {
		return instance;
	}
	
	public static final void init() {
		instance = new OI();
	}
	
}
