public class Main {
    public static void main(String[] args) {
        IntegerPrinter integerPrinter = new IntegerPrinter(23);
        DoublePrinter doublePrinter = new DoublePrinter(23.0);
        StringPrinter stringPrinter = new StringPrinter("string");

        GenericPrinter<Integer> integerGenericPrinter = new GenericPrinter<>(1);
        GenericPrinter<Double> doubleGenericPrinter = new GenericPrinter<>(1.0);
        GenericPrinter<String> stringGenericPrinter = new GenericPrinter<>("string");

        integerPrinter.print();
        doublePrinter.print();
        stringPrinter.print();

        integerGenericPrinter.print();
        doubleGenericPrinter.print();
        stringGenericPrinter.print();
    }
}