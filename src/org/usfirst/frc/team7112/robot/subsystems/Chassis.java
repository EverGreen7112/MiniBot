package org.usfirst.frc.team7112.robot.subsystems;

import static org.usfirst.frc.team7112.robot.RobotMap.Chassis_Victor_Left;
//import static org.usfirst.frc.team7112.robot.RobotMap.Chassis_Victor_Back_Right;
import static org.usfirst.frc.team7112.robot.RobotMap.Chassis_Victor_Right;
//import static org.usfirst.frc.team7112.robot.RobotMap.Chassis_Victor_Front_Right;
import static org.usfirst.frc.team7112.robot.RobotMap.Chassis_Talon_Back_Right;
import static org.usfirst.frc.team7112.robot.RobotMap.Chassis_Talon_Front_Right;

import org.usfirst.frc.team7112.robot.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.VictorSP;
import com.ctre.CANTalon;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Chassis extends Subsystem {
	
	private VictorSP VictorLeft;
	private VictorSP VictorRight;
	private WPI_TalonSRX Talon_Back_Right;
	private WPI_TalonSRX Talon_Front_Right;
	private static Chassis instance;
	private DifferentialDrive m_Driver;
	private SpeedControllerGroup left;
	private SpeedControllerGroup right;
	private double driveMultiplier;
	
	private Chassis() {
		VictorLeft = new VictorSP(Chassis_Victor_Left);
		VictorRight = new VictorSP(Chassis_Victor_Right);

		m_Driver = new DifferentialDrive(VictorLeft,VictorRight);
		driveMultiplier = 0.5;
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
