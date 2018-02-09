package org.usfirst.frc.team7112.robot;

import edu.wpi.first.wpilibj.buttons.Button;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public Joystick JS = new Joystick(0);
	Button button_X = new JoystickButton(JS, 3);
	Button button_B = new JoystickButton(JS, 2);

	private static OI instance;
	
	public Button GetXButton(){
		return button_X;
	}
	
	public Button GetBButton(){
		return button_B;
	}
	
	
	public double GetXAxis() {
		return JS.getRawAxis(0);
	}
	
	public double GetYAxis() {
		return JS.getRawAxis(1);
	}
	
	public double GetRTAxis() {
		return JS.getRawAxis(3);
	}
	
	public double GetLTAxis() {
		return JS.getRawAxis(2);
	}
	
	public int GetPOV(){
		return JS.getPOV(0);
	}
	
	public static final OI getInstance() {
		return instance;
	}
	
	public static final void init() {
		instance = new OI();
	}
	
}
