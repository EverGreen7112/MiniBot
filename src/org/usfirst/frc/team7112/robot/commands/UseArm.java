package org.usfirst.frc.team7112.robot.commands;

import org.usfirst.frc.team7112.robot.OI;
import org.usfirst.frc.team7112.robot.subsystems.Arm;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class UseArm extends Command {

    public UseArm() {
        // Use requires() here to declare subsystem dependencies
        requires(Arm.getInstance());
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Arm.getInstance().useMotors();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Arm.getInstance().stopMotor();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
