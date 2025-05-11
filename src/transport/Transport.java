package transport;

public abstract class Transport {
    public int speed;  // приватное поле

    public Transport(int speed) {
        this.speed = speed;
    }

    // Геттер для поля speed
    public int getSpeed() {
        return speed;
    }

    // Сеттер для поля speed (если нужно изменять его позже)
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract void move();
}
