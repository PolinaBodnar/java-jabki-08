package sounds;

public class Dog implements SoundEmitter {
    @Override
    public void makeSound() {
        System.out.println("Dog: Гав! Гав!");
    }
}
