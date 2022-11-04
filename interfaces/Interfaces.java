interface BlueColorBottleInterface {
    String color = "Blue";

    void fillUp();
}

interface BlueColorBottleInterfaceStatic {
    static void pourOut() {
        System.out.println("Pouring out!");
    }
}

public class Interfaces implements BlueColorBottleInterface {
    public static void main(String[] args) {
        System.out.println(color);

        Interfaces interf = new Interfaces();

        interf.fillUp();

        BlueColorBottleInterfaceStatic.pourOut(); // static interface methods should be called directly

    }

    @Override
    public void fillUp() {
        System.out.println("Filled up!");
    }
}