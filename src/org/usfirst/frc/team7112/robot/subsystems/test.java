package org.usfirst.frc.team7112.robot.subsystems;
import static org.usfirst.frc.team7112.robot.RobotMap.m_Spark2;

import org.usfirst.frc.team7112.robot.commands.testClaw;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class test extends Subsystem {

    private static test instance;
    private SpeedController m_motor;
    
    private test(){
    	m_motor = new Spark(m_Spark2);
    }
	public static final void init() {
		instance = new test();
	}

	public static final test getInstance() {
		return instance;
	}
	
	public void setMotorPower(double power){
		m_motor.set(power);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    	setDefaultCommand(new testClaw());
    }
}

