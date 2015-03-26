package com.pafnat.tutorial.patterns._08_.Builder;

// The concrete builder class that assembles the parts
// of the finished Robot object

public class OldRobotBuilder implements RobotBuilder {

    private Robot robot;

    public OldRobotBuilder() {

        this.robot = new Robot();

    }

    @Override
    public void buildRobotHead() {

        robot.setRobotHead("Tin Head");

    }

    @Override
    public void buildRobotTorso() {

        robot.setRobotTorso("Tin Torso");

    }

    @Override
    public void buildRobotArms() {

        robot.setRobotArms("Blowtorch Arms");

    }

    @Override
    public void buildRobotLegs() {

        robot.setRobotLegs("Rollar Skates");

    }

    @Override
    public Robot getRobot() {

        return this.robot;
    }



}
