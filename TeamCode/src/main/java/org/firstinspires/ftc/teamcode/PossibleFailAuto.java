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

        DriveForward(-0.5);
        sleep(1000);
        StopDriving();

        TurnRight(0.5);
        sleep(3000);
        StopDriving();


    }

    public void DriveForward(double power) {
        motorLeft.setPower(10);
        motorRight.setPower(10);

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