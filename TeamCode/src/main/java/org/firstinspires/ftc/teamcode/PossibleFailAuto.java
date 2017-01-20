package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.robotcontroller.external.samples.*;

/**
 * Created by robotics on 1/19/2017.
 */
@Autonomous(name="PossibleFailAuto", group="Scott")
public class PossibleFailAuto extends LinearOpMode {


    DcMotor motorLeft;
    DcMotor motorRight;


    @Override
    public void runOpMode() throws InterruptedException {
        motorLeft = hardwareMap.dcMotor.get("left_drive");
        motorRight = hardwareMap.dcMotor.get("right_drive");

        motorLeft.setDirection(DcMotor.Direction.REVERSE);


        waitForStart();

        DriveForward(-5000);
        sleep(4500);
        StopDriving();
        sleep(25.5);
//sleep is in milliseconds



    }

    public void DriveForward(double power) {
        motorLeft.setPower(7000);
        motorRight.setPower(7000);

    }

    public void StopDriving() {
        DriveForward(0);
    }

    public void TurnRight(double power) {
        motorRight.setPower(-power);
        motorLeft.setPower(power);
    }
    public void TurnLeft (double power)
    {
        motorRight.setPower(power);
        motorLeft.setPower(-power);
    }

}