package transport;

public abstract class Transport {
    protected int speed;

    public Transport(int speed) {
        this.speed = speed;
    }

    public abstract void move();
}
