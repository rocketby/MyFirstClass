public class Flower {

    String name;
    String color;
    int numberOfPetals;
    boolean hasThorns;

    public Flower(String name, String color, int numberOfPetals, boolean hasThorns) {
        this.name = name;
        this.color = color;
        this.numberOfPetals = numberOfPetals;
        this.hasThorns = hasThorns;
    }

    public Flower() {
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    static void sayGreetings() {
        System.out.println("Welcome to Flower Garden!");
    }

}
