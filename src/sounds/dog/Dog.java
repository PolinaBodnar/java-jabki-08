package sounds.dog;

import sounds.SoundEmitter;

public class Dog implements SoundEmitter {
    @Override
    public void makeSound() {
        System.out.println("Dog: Гав! Гав!");
    }
}
