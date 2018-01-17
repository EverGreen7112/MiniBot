package org.usfirst.frc.team7112.robot.subsystems;

import static org.usfirst.frc.team7112.robot.RobotMap.m_Spark1;
import static org.usfirst.frc.team7112.robot.RobotMap.m_Spark2;

import org.usfirst.frc.team7112.robot.OI;
import org.usfirst.frc.team7112.robot.commands.ArmClose;
import org.usfirst.frc.team7112.robot.commands.ArmOpen;
import org.usfirst.frc.team7112.robot.commands.MoveArm;
import org.usfirst.frc.team7112.robot.commands.StopMotor;
import org.usfirst.frc.team7112.robot.commands.TestArm;

import static org.usfirst.frc.team7112.robot.RobotMap.Arm_MicroSwitch;


import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Arm extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	private static Arm instance;
	private SpeedController m_Motor1;
	private SpeedController m_Motor2;
	private DigitalInput m_MicroSwitch;

	private Arm() {
		m_Motor1 = new Spark(m_Spark1);
		m_Motor2 = new Spark(m_Spark2);
		m_MicroSwitch = new DigitalInput(Arm_MicroSwitch);
		}

	public void setMotorPower(double power) {
		m_Motor1.set(power);
		m_Motor2.set(power);
	}
	
	public void moveArm(){
			OI.getInstance().GetXButton().whenPressed(new ArmOpen());
			OI.getInstance().GetBButton().whenPressed(new ArmClose());
			OI.getInstance().GetXButton().whenReleased(new StopMotor());
			OI.getInstance().GetBButton().whenReleased(new StopMotor());
	}
	
	public void stopMotor(){
		m_Motor1.stopMotor();
		m_Motor2.stopMotor();
	}
	
	public boolean isPressed(){
		return m_MicroSwitch.get();
	}
	
	public static final void init() {
		instance = new Arm();
	}

	public static final Arm getInstance() {
		return instance;
	}
		
    public void initDefaultCommand() {
    	setDefaultCommand(new MoveArm());
    }
}

