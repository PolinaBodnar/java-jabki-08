package transport.air;

import transport.Transport;

public class Airplane extends Transport {
    public Airplane(int speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.println("Самолет летает со скоростью " + getSpeed() + " км/ч на высоте 10 000 км.");
    }
}
