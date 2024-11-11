// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  
  // TODO: Instantiate motor controller objects
  private final TalonFX _frontRightDriveMotor = new TalonFX(1);
  private final TalonFX _frontLeftDriveMotor = new TalonFX(6);
  private final TalonFX _backRightDriveMotor = new TalonFX(11);
  private final TalonFX _backLeftDriveMotor = new TalonFX(8);

  // TODO: Instantiate motor controller group objects
  private final MotorControllerGroup _rightDriveMotors = new MotorControllerGroup(_frontRightDriveMotor, _backRightDriveMotor);

  private final MotorControllerGroup _leftDriveMotors = new MotorControllerGroup(_frontLeftDriveMotor, _backLeftDriveMotor);

  // TODO: Declare differential drive object
  private DifferentialDrive _drive = new DifferentialDrive(_leftDriveMotors, _rightDriveMotors);
  
  
  /** Creates a new DriveSubsystem. */
  public DriveSubsystem() {
    // TODO: Call any necessary motor controller group methods
    _leftDriveMotors.setInverted(true);
  }

  // TODO: Create a new method that takes in a double (decimal number) called speed
  //       and a double called rotate, and passes these values into the differential
  //       drive arcadeDrive method that we used before

  public void driveWithJoysticks(double speed, double rotate) {
    _drive.arcadeDrive(speed, rotate);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

  }
}
