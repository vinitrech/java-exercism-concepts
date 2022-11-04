/*  public class GenericPrinter<T, Y> { <- multiple generic types
 *  public class GenericPrinter<T extends IntegerPrinter & Serializable & AnotherInterface> { <- the 
 *  generic type can be bound to 1 class and many interfaces, the class must come first
 */

public class GenericPrinter<T> {
    T thingToPrint;

    public GenericPrinter(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        shout(thingToPrint);
    }

    // private static <T> T shout(T thingToPrint) <- generic methods can return the
    // generic object
    private static <T> void shout(T thingToPrint) {
        System.out.println(thingToPrint + "!");
    }
}