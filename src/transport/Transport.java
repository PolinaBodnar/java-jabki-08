package transport;

public abstract class Transport {
    private int speed;

    public Transport(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract void move();
}
