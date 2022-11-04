import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        printList(intList);
    }

    // Wildcards are defined with "?" symbol, that accepts anything
    // private static void printList(List<? extends AnotherClass> myList) <-
    // wildcard types can be bound to other classes/interfaces just like generic
    // types
    private static void printList(List<?> myList) {
        System.out.println(myList);
    }
}