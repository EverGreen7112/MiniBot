package org.usfirst.frc.team7112.robot.commands;

import org.usfirst.frc.team7112.robot.subsystems.Arm;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ArmOpen extends Command {

    public ArmOpen() {
        // Use requires() here to declare subsystem dependencies
        requires(Arm.getInstance());
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Arm.getInstance().setMotorPower(0.25);
    }
 
    protected boolean isFinished() {
    	if(Arm.getInstance().isPressed()) return true;
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Arm.getInstance().setMotorPower(0);
    }
}
