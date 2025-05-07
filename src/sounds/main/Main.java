package sounds.main;

import sounds.SoundEmitter;
import sounds.dog.Dog;
import sounds.alarmclock.AlarmClock;
import sounds.carhorn.CarHorn;

public class Main {
    public static void playAllSounds(SoundEmitter[] devices) {
        for (SoundEmitter device : devices) {
            device.makeSound();
        }
    }

    public static void main(String[] args) {
        SoundEmitter[] devices = {
                new Dog(),
                new AlarmClock(),
                new CarHorn()
        };

        playAllSounds(devices);
    }
}
