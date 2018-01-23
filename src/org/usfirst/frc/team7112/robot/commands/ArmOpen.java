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
    	if(Arm.getInstance().isPressed2())
    	Arm.getInstance().setMotorPower(-0.1);
    }
 
    protected boolean isFinished() {
    	if(!Arm.getInstance().isPressed2()) return true;
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
