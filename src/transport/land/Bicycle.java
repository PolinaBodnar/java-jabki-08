package transport.land;

import transport.Transport;

public class Bicycle extends Transport {
    public Bicycle(int speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.println("Велосипед развивает скорость " + speed + " км/ч по ровной дороге.");
    }
}
