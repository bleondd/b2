package exam1;

public class FootballPlayer extends Athlete {
    private int shirtNo;
    private String position;

    public FootballPlayer(String name, int height, double weight, int age, int shirtNo, String position) {
        super(name, height, weight, age);
        this.shirtNo = shirtNo;
        this.position = position;
    }

    public int getShirtNo() {
        return shirtNo;
    }

    public String getPosition() {
        return position;
    }

    public void shoot() {
        System.out.println(name + " is shooting a ball.");
    }

    public void pass() {
        System.out.println(name + " is passing to Messi.");
    }
}

