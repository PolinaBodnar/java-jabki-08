package transport;

public class Bicycle extends Transport {
    public Bicycle(int speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.println("Велосипед развивает скорость " + getSpeed() + " км/ч по ровной дороге.");
    }
}
