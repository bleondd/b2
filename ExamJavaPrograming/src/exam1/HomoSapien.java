package exam1;

public abstract class HomoSapien {
    protected String name;
    protected int height;
    protected double weight;
    protected int age;

    public HomoSapien(String name, int height, double weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public abstract void speak();
    public abstract void run();
}

