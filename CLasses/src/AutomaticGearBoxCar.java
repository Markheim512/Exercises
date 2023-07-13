public class AutomaticGearBoxCar extends Car {

    public AutomaticGearBoxCar(double speed, double wheelAngle, int gear) {
        super(speed, wheelAngle, gear, false);
    }

    public AutomaticGearBoxCar(double wheelAngle, int gear) {
        this(0, wheelAngle, gear);
    }

    public AutomaticGearBoxCar() {
        this(0,0);
    }

    public static boolean isValidGear(int gear) {
        switch(gear) {
            case -1: case 0: case 1:
                return true;
            default:
                return false;
        }
    }
    @Override
    public void changeGear(int newGear) {
        if(!isValidGear(newGear)) {
            System.out.println("Not a valid gear for an automatic gearbox.");
            return;
        }
        super.setClutchOn();
        super.changeGear(newGear);
        super.setClutchOff();
    }

    @Override
    public void setClutchOn() {
        System.out.println("This vehicle does not have a clutch!");
    }

    @Override
    public void setClutchOff() {
        this.setClutchOn();
    }
}
