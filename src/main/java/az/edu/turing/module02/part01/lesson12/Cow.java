package az.edu.turing.module02.part01.lesson12;

public class Cow extends Animal{
    private String sound;

    public Cow(String name, int age, String sound) {
        super(name, age);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public void eat() {
        System.out.println("Cow is eating");
    }

    @Override
    public String toString() {
        return "Cow{" +
                "sound='" + sound + '\'' +
                "} " + super.toString();
    }
}
