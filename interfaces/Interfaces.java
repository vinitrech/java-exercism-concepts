interface BlueColorBottleInterface {
    String color = "Blue";

    void fillUp();
}

public class Interfaces implements BlueColorBottleInterface {
    public static void main(String[] args) {
        System.out.println(color);

        Interfaces interf = new Interfaces();

        interf.fillUp();

    }

    @Override
    public void fillUp() {
        System.out.println("Filled up!");
    }
}