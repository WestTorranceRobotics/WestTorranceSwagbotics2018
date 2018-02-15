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

import edu.wpi.first.wpilibj.AnalogGyro;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.*;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainLeftOne;
    public static SpeedController driveTrainLeftTwo;
    public static SpeedControllerGroup driveTrainRightGroup;
    public static SpeedController driveTrainRightOne;
    public static SpeedController driveTrainRightTwo;
    public static SpeedControllerGroup driveTrainLeftGroup;
    public static DifferentialDrive driveTrainDiffDrive;
    
    public static SpeedController liftMotorOne;
    
    public static SpeedController liftMotorTwo;
    
    public static SpeedControllerGroup liftMotorGroup;
    
    public static Encoder liftEncoder;
    
    public static Encoder DriveEncoder;
    
    public static PIDController liftPID;
    
    public static DigitalInput liftLimitSwitchBottom;
    
    public static SpeedController intakeFoldingMotor;
    
    public static AnalogPotentiometer intakeFoldingPotentiometer;
    
    public static PIDController intakeFoldingPID;
    
    public static SpeedController intakeIntakeMotorTwo;
    
    public static SpeedController intakeIntakeMotorOne;
    
    public static SpeedControllerGroup intakeIntakeGroup;
    public static Compressor intakeCompressor;
    public static DoubleSolenoid intakeGrabberDoubleSolenoidOne;
    public static DoubleSolenoid intakeGrabberDoubleSolenoidTwo;
    public static AnalogGyro driveTrainGyro;
    

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftOne = new VictorSP(3);
        SmartDashboard.putData("DriveTrain LeftOne", (VictorSP) driveTrainLeftOne);
        driveTrainLeftOne.setInverted(false);
        driveTrainLeftTwo = new VictorSP(4);
        SmartDashboard.putData("DriveTrain LeftTwo", (VictorSP) driveTrainLeftTwo);
        driveTrainLeftTwo.setInverted(false);
        driveTrainRightGroup = new SpeedControllerGroup(driveTrainLeftOne, driveTrainLeftTwo  );
        SmartDashboard.putData("DriveTrain RightGroup", driveTrainRightGroup);
        
        driveTrainRightOne = new VictorSP(5);
        SmartDashboard.putData("DriveTrain RightOne", (VictorSP) driveTrainRightOne);
        driveTrainRightOne.setInverted(false);
        driveTrainRightTwo = new VictorSP(6);
        SmartDashboard.putData("DriveTrain RightTwo", (VictorSP) driveTrainRightTwo);
        driveTrainRightTwo.setInverted(false);
        driveTrainLeftGroup = new SpeedControllerGroup(driveTrainRightOne, driveTrainRightTwo  );
        SmartDashboard.putData("DriveTrain LeftGroup", driveTrainLeftGroup);
        
        driveTrainDiffDrive = new DifferentialDrive(driveTrainRightGroup, driveTrainLeftGroup);
        SmartDashboard.putData("DriveTrain DiffDrive", driveTrainDiffDrive);
        driveTrainDiffDrive.setSafetyEnabled(true);
        driveTrainDiffDrive.setExpiration(0.1);
        driveTrainDiffDrive.setMaxOutput(1.0);

        liftMotorOne = new VictorSP(7);
        SmartDashboard.putData("Lift MotorOne", (VictorSP) liftMotorOne);
        liftMotorOne.setInverted(false);
        liftMotorTwo = new VictorSP(8);
        SmartDashboard.putData("Lift MotorTwo", (VictorSP) liftMotorTwo);
        liftMotorTwo.setInverted(false);
        liftMotorGroup = new SpeedControllerGroup(liftMotorOne, liftMotorTwo);
        SmartDashboard.putData("Lift MotorGroup", liftMotorGroup);
        
        liftEncoder = new Encoder(2, 3, false, EncodingType.k4X);
        SmartDashboard.putData("Lift Encoder", liftEncoder);
        liftEncoder.setDistancePerPulse(1.0);
        liftEncoder.setPIDSourceType(PIDSourceType.kRate);
        liftPID = new PIDController(1.0, 0.0, 0.0, 0.0, liftEncoder, liftMotorGroup, 0.02);
        SmartDashboard.putData("Lift PID", liftPID);
        liftPID.setContinuous(false);
        liftPID.setAbsoluteTolerance(0.2);

        liftPID.setOutputRange(-1.0, 1.0);
        liftLimitSwitchBottom = new DigitalInput(4);
        intakeFoldingMotor = new VictorSP(2);
        SmartDashboard.putData("Intake FoldingMotor", (VictorSP) intakeFoldingMotor);
        intakeFoldingMotor.setInverted(false);
        intakeFoldingPotentiometer = new AnalogPotentiometer(0, 1.0,  0.0);
        SmartDashboard.putData("Intake FoldingPotentiometer", intakeFoldingPotentiometer);
        
        intakeFoldingPID = new PIDController(1.0, 0.0, 0.0, 0.0, intakeFoldingPotentiometer, intakeFoldingMotor, 0.02);
        SmartDashboard.putData("Intake FoldingPID", intakeFoldingPID);
        intakeFoldingPID.setContinuous(false);
        intakeFoldingPID.setAbsoluteTolerance(0.2);

        intakeFoldingPID.setOutputRange(-1.0, 1.0);
        intakeIntakeMotorTwo = new VictorSP(0);
        SmartDashboard.putData("Intake IntakeMotorTwo", (VictorSP) intakeIntakeMotorTwo);
        intakeIntakeMotorTwo.setInverted(false);
        intakeIntakeMotorOne = new VictorSP(1);
        SmartDashboard.putData("Intake IntakeMotorOne", (VictorSP) intakeIntakeMotorOne);
        intakeIntakeMotorOne.setInverted(false);
        intakeIntakeGroup = new SpeedControllerGroup(intakeIntakeMotorOne, intakeIntakeMotorTwo);
        SmartDashboard.putData("Intake IntakeGroup", intakeIntakeGroup);
        
        intakeCompressor = new Compressor(0);
        intakeCompressor.setClosedLoopControl(true);
        SmartDashboard.putData("Intake Compressor", intakeCompressor);
        
        intakeGrabberDoubleSolenoidOne = new DoubleSolenoid(1, 2);
        SmartDashboard.putData("Intake GrabberDoubleSolenoidOne", intakeGrabberDoubleSolenoidOne);
        
        intakeGrabberDoubleSolenoidTwo = new DoubleSolenoid(0, 3);
        SmartDashboard.putData("Intake GrabberDoubleSolenoidTwo", intakeGrabberDoubleSolenoidTwo);
         
        DriveEncoder = new Encoder(0,1, false, EncodingType.k4X);
        SmartDashboard.putData("Drive Encoder", DriveEncoder);
        DriveEncoder.setDistancePerPulse(.052333/*.0042016806722689*/);
        
        driveTrainGyro = new AnalogGyro(1);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
