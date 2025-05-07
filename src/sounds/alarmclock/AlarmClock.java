package sounds.alarmclock;

import sounds.SoundEmitter;

public class AlarmClock implements SoundEmitter {
    @Override
    public void makeSound() {
        System.out.println("AlarmClock: Дзыыыыынь!");
    }
}
