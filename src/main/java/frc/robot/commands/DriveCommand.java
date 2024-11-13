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

  // TODO: Declare (but don't instantiate) a member variable to store your DriveSubsystem object
  // TODO: Declare (but don't instantiate) a member variable to store speed as a DoubleSupplier object
  // TODO: Declare (but don't instantiate) a member variable to store rotate as a DoubleSupplier object

  // Reminder - typical convention for member variables uses an _ at the beginning of the name, along 
  // with camelCase capitalization

  
  public DriveCommand(DoubleSupplier speed, DoubleSupplier rotate, DriveSubsystem driveSubsystem) {
 
    // TODO: Set your member variables to be equal to the values you pass into this constructor

    
    // TODO: Add requirements for any subsystems that are used in this command
    // Use addRequirements() here to declare subsystem dependencies.

  
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // TODO: Call the drive method you created in DriveSubsystem.java. Pass in a double from your 
    //       speed and rotate variables using the getAsDouble() method

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
