// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5124.PowerUp.commands;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc5124.PowerUp.Robot;
import org.usfirst.frc5124.PowerUp.RobotMap;

/**
 *
 */
public class DriveTrainSubCommand extends Command {

    
	
	
	
    public DriveTrainSubCommand() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	if(ActivateButtonCommand.isActive) {
    		double left  = -Robot.oi.gPad.getRawAxis(1);
    		double right = -Robot.oi.gPad.getRawAxis(3);
    		if(Math.abs(left) < 0.15) {
    			left = 0;
    		}
    		if(Math.abs(right) < 0.15) {
    			right = 0;
    		}
    		double power = (-Robot.oi.joy.getRawAxis(2) + 1) / 2;
    		Robot.driveTrain.tankDrive(left * power, right * power);
    		SmartDashboard.putNumber("Power Multiplier", power);
    		
    	}
    	else {
    		Robot.driveTrain.tankDrive(0, 0);
    	}
    	SmartDashboard.putNumber("DriveEncoder get", RobotMap.DriveEncoder.get());
		SmartDashboard.putNumber("DriveEncoder raw", RobotMap.DriveEncoder.getRaw());
		SmartDashboard.putNumber("DriveEncoder distance", RobotMap.DriveEncoder.getDistance());
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
}
