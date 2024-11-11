// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import javax.tools.Diagnostic;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveSubsystem;

public class DriveCommand extends Command {
  /** Creates a new DriveCommand. */
  private DriveSubsystem _driveSubsystem;
  private DoubleSupplier _speed;
  private DoubleSupplier _rotate;
  
  public DriveCommand(DoubleSupplier speed, DoubleSupplier rotate, DriveSubsystem driveSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    _speed = speed;
    _rotate = rotate;
    _driveSubsystem = driveSubsystem;

    addRequirements(driveSubsystem);
  
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    _driveSubsystem.driveWithJoysticks(_speed.getAsDouble(), _rotate.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false; // runs forever
  }
}
