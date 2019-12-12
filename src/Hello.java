public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Parsing Values from a string

        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString = "2018.125";
        double doubleNumber = Double.parseDouble(numberAsString);
        System.out.println("Doublenumber = " + doubleNumber);

    }
}
