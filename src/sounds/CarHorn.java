package sounds;

public class CarHorn implements SoundEmitter {
    @Override
    public void makeSound() {
        System.out.println("CarHorn: Биииб! Бииб!");
    }
}
