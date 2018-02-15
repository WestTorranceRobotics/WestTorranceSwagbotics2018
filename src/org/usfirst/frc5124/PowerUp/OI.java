// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5124.PowerUp;

import org.usfirst.frc5124.PowerUp.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc5124.PowerUp.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the comm
 * 
 * ands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
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

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick joy;
    public Joystick buttons;
    public JoystickButton key;
    public JoystickButton threeSwitchUp;
    public JoystickButton threeSwitchDown;
    public JoystickButton grabButton;
    public JoystickButton releaseButton;
    
    public Joystick gPad;

    public JoystickButton intakeButton;
    public JoystickButton outtakeButton;
    
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joy = new Joystick(0);
        
        buttons = new Joystick(1);
        key = new JoystickButton(buttons, 5);
        threeSwitchUp   = new JoystickButton(buttons, 9);
        threeSwitchDown = new JoystickButton(buttons, 8);
        intakeButton = new JoystickButton(buttons, 10);
        outtakeButton = new JoystickButton(buttons, 11);
        grabButton = new JoystickButton(buttons, 13);
        releaseButton = new JoystickButton(buttons, 14);
        
        
        gPad = new Joystick(2);
        
        
        key.whileHeld(new ActivateButtonCommand());
        threeSwitchUp.whileHeld(new LiftTopButtonCommand());
        threeSwitchDown.whileHeld(new LiftBottomButtonCommand());
        intakeButton.whileHeld(new IntakeButtonCommand());
        outtakeButton.whileHeld(new OuttakeButtonCommand());
        grabButton.whenPressed(new GrabButtonCommand());
        releaseButton.whenPressed(new ReleaseButtonCommand());
        
        
        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("DriveTrainSubCommand", new DriveTrainSubCommand());
        SmartDashboard.putData("LiftSubCommand", new LiftSubCommand());
        SmartDashboard.putData("IntakeSubCommand", new IntakeSubCommand());
        SmartDashboard.putData("ActivateButtonCommand", new ActivateButtonCommand());
        /*
        SmartDashboard.putNumber("DriveEncoder get", RobotMap.DriveEncoder.get());
		SmartDashboard.putNumber("DriveEncoder raw", RobotMap.DriveEncoder.getRaw());
		SmartDashboard.putNumber("DriveEncoder distance", RobotMap.DriveEncoder.getDistance());
*/
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoy() {
        return joy;
    }

    public Joystick getButtons() {
        return buttons;
    }
    
    public Joystick getGPad() {
        return gPad;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

