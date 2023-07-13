public class Vehicle {

    private double speed;

    public Vehicle(double speed) {
        this.speed = speed;
    }

    public void changeSpeed (double speedIncrease) {
        speed += speedIncrease;

    }

    public double getSpeed() {
        return speed;
    }
}
