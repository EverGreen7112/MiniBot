package org.usfirst.frc.team7112.robot.commands;

import org.usfirst.frc.team7112.robot.OI;
import org.usfirst.frc.team7112.robot.subsystems.test;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class testClaw extends Command {

    public testClaw() {
        // Use requires() here to declare subsystem dependencies
        requires(test.getInstance());
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(OI.getInstance().GetLTAxis()>0)
    		test.getInstance().setMotorPower(OI.getInstance().GetLTAxis()*0.5);
    	else
    		test.getInstance().setMotorPower(-OI.getInstance().GetRTAxis()*0.9);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
