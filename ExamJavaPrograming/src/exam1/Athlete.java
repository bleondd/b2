package exam1;

public class Athlete extends HomoSapien implements AthleteSkills {
    public Athlete(String name, int height, double weight, int age) {
        super(name, height, weight, age);
    }

    @Override
    public void speak() {
        System.out.println(name + " is speaking.");
    }

    @Override
    public void run() {
        System.out.println(name + " is running.");
    }

    @Override
    public void runFaster() {
        System.out.println(name + " is running faster.");
    }

    @Override
    public void jumpHigher() {
        System.out.println(name + " is jumping higher.");
    }
}

