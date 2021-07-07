public class Main {

    public static void main(String[] args) {
        Flower rose = new Flower("Hybrid rose", "Pink", 20, true);
        Flower tulip = new Flower();
        tulip.name = "Curly tulip";
        tulip.color = "Red";
        tulip.numberOfPetals = 7;
        tulip.hasThorns = false;

        tulip.sayGreetings();

        System.out.println("Name of flower: " + tulip.name +
                ", Color: " + tulip.color +
                ", Number of petals: " + tulip.numberOfPetals +
                ", Has Thorns? " + tulip.hasThorns);

        rose.sayGreetings();

        System.out.println("Name of flower: " + rose.name +
                ", Color: " + rose.color +
                ", Number of petals: " + rose.numberOfPetals +
                ", Has Thorns? " + rose.hasThorns);

        System.out.println("Color of rose is: " + rose.getColor());

        //set color of flower
        rose.setColor("White");

        System.out.println("Now color of rose is: "+ rose.getColor());

    }
}
