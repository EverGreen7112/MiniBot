package org.usfirst.frc.team7112.robot;

import edu.wpi.first.wpilibj.buttons.Button;

import org.usfirst.frc.team7112.robot.subsystems.Arm;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team7112.robot.commands.ArmOpen;
import org.usfirst.frc.team7112.robot.commands.ArmClose;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
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
