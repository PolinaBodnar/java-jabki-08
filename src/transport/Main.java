package transport;

public class Main {
    public static void main(String[] args) {
        Transport[] vehicles = {
                new Bicycle(25),
                new Airplane(800)
        };

        startRace(vehicles);
    }

    public static void startRace(Transport[] vehicles) {
        for (Transport vehicle : vehicles) {
            vehicle.move();
        }
    }
}
