package org.usfirst.frc.team7112.robot.subsystems;

import static org.usfirst.frc.team7112.robot.RobotMap.Chassis_Victor_Left;
import static org.usfirst.frc.team7112.robot.RobotMap.Chassis_Victor_Right;

import org.usfirst.frc.team7112.robot.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.VictorSP;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Chassis extends Subsystem {
	
	private VictorSP VictorLeft;
	private VictorSP VictorRight;
	private static Chassis instance;
	private DifferentialDrive m_Driver;
	private double driveMultiplier;
	private double driveMultiplierSlow;
	
	private Chassis() {
		VictorLeft = new VictorSP(Chassis_Victor_Left);
		VictorRight = new VictorSP(Chassis_Victor_Right);

		m_Driver = new DifferentialDrive(VictorLeft,VictorRight);
		driveMultiplier = 0.5;
		driveMultiplierSlow = 0.3;
	}
	
	public double getDriveMultiplierSlow(){
		return driveMultiplierSlow;
	}
	
	public double getDriveMultiplier() {
		return driveMultiplier;
	}
	
	public void setDriveMultiplier(double mult) {
		driveMultiplier = mult;
	}
	
	public static final void init() {
		instance = new Chassis();
	}
	
	public static final Chassis getInstance() {
		return instance;
	}
	
	public void arcadeDrive(double forward, double side) {
		m_Driver.arcadeDrive(forward, side);
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new ArcadeDrive());
		
	}
		
}
