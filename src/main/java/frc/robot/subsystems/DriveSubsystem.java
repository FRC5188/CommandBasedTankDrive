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
  private final TalonFX _frontLeftDriveMotor = new TalonFX(1);
  private final TalonFX _frontRightDriveMotor = new TalonFX(6);
  private final TalonFX _backLeftDriveMotor = new TalonFX(11);
  private final TalonFX _backRightDriveMotor = new TalonFX(8);

  // TODO: Instantiate motor controller group objects
  private final MotorControllerGroup _leftDriveMotors = new MotorControllerGroup
      (_frontLeftDriveMotor, _backLeftDriveMotor);
  private final MotorControllerGroup _rightDriveMotors = new MotorControllerGroup
      (_frontRightDriveMotor, _backRightDriveMotor);

  // TODO: Instantiate differential drive object
  private DifferentialDrive _drive = new DifferentialDrive(_rightDriveMotors, _leftDriveMotors);
  
  /** Creates a new DriveSubsystem. */
  public DriveSubsystem() {

    // TODO: Call any necessary motor controller group methods
    _rightDriveMotors.setInverted(true);
  }

  // TODO: Create a new method that takes in a double (decimal number) called speed
  //       and a double called rotate, and passes these values into the DifferentialDrive
  //       arcadeDrive method that we used before

  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run

  }
}
