// TITANIUM RAMS 5959, Chasis de practica de tipo ARCADE DRIVE 
//Codigo para Robot de Reto Crescendo 2024
// Code by: Danna, Denis y Prof. Alviso. 

package frc.robot; //Este es el nombre del paquete principal del codigo del robot.

import edu.wpi.first.wpilibj.TimedRobot; //Este es el framework para codificar un robot tipo Timed Robot.
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;//Esta Es el Driver de motores PWM Victors
import edu.wpi.first.wpilibj.PS4Controller;//Esta es la libreria para usar un control de PS4

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   * Los modos periodicos se ejecutan cada 20 ms.
   */
  @Override
  public void robotInit() {} //Se ejecuta una vez al encender el robot

  @Override
  public void robotPeriodic() {}//Se ejecuta en loop mientras el robot esta encendido

  @Override
  public void autonomousInit() {}//Se ejecuta una vez al habilitar el modo autonomo

  @Override
  public void autonomousPeriodic() {}//Se ejecuta en loop mientras el modo autonomo este habilitado

  @Override
  public void teleopInit() {}//Se ejecuta una vez al habilitar el modo teleoperado

  @Override
  public void teleopPeriodic() {}//Se ejecuta en loop mientras el modo teleoperado este activado.

  @Override
  public void disabledInit() {}//Se ejecuta una vez al deshabilitar el robot

  @Override
  public void disabledPeriodic() {}//Se ejecuta en loop al estar deshabilitado el robot.

  @Override
  public void testInit() {}//Se ejecuta una vez al habilitar el modo test.

  @Override
  public void testPeriodic() {}//Se ejecuta en loop al estar habilitado el modo test.

  @Override
  public void simulationInit() {}//Se ejecuta una vez al iniciar el simulador

  @Override
  public void simulationPeriodic() {}//Se ejecuta en loop al habilitar el simulador.
}
