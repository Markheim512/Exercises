public class Car extends Vehicle {

    private double wheelAngle;
    private int gear;

    private boolean isClutchOn;

    public Car(double speed, double wheelAngle, int gear, boolean isClutchOn) {
        super(speed);
        this.wheelAngle = wheelAngle;
        this.gear = gear;
        this.isClutchOn = isClutchOn;
    }

    public Car(double wheelAngle, int gear) {
        this(0, wheelAngle, gear, true);
    }

    public Car() {
        this(0, 0);
    }

    public double getWheelAngle() {
        return wheelAngle;
    }

    public int getGear() {
        return gear;
    }

    public boolean isClutchOn() {
        return isClutchOn;
    }

    public void changeGear(int newGear) {
        if (!isClutchOn) {
            System.out.println("Engage the clutch before changing gears.");
            return;
        } else if (super.getSpeed() * newGear < 0 || newGear < -1 || newGear > 6) {
            System.out.println("Invalid gear shift.");
        } else {
            gear = newGear;
        }
    }

    public void steerLeft(double angle) {
        if (wheelAngle - angle < -45 ) {
            System.out.println("Can't turn that much.");
        } else {
            wheelAngle -= angle;
        }
    }
    public void steerRight(double angle) {
        if (wheelAngle + angle > 45 ) {
            System.out.println("Can't turn that much.");
        } else {
            wheelAngle += angle;
        }
    }

    @Override
    public void changeSpeed(double speedIncrease) {
        if (gear == 0 || isClutchOn) {
            System.out.println("Can't accelerate.");
            return;
        }
        super.changeSpeed(speedIncrease);
        switch(gear) {
            case -1:
                if (getSpeed() > 0) {
                    super.changeSpeed(-getSpeed());
                }
                return;
            default:
                if (getSpeed() < 0) {
                    super.changeSpeed((-getSpeed()));
                }
        }
    }

    public void setClutchOn() {
        isClutchOn = true;
    }

    public void setClutchOff() {
        isClutchOn = false;
    }
}
