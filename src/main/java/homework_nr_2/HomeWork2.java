package homework_nr_2;

public class HomeWork2 {
    public static void main(String[] args) {    //PSVM
        System.out.println("Hello world");  //SOUT

        long CurrentWorldPopulation = 7811080815L;
        int CarsProducedThisYear = 55235358;
        char FirstLetterInAlphabet = 'A';
        boolean JavaIsAmazing = true;
        double Pi = 3.14159;

        System.out.println("CurrentWorldPopulation: " + CurrentWorldPopulation);
        System.out.println("CarsProducedThisYear: " + CarsProducedThisYear);
        System.out.println("FirstLetterInAlphabet: " + FirstLetterInAlphabet);
        System.out.println("JavaIsAmazing: " + JavaIsAmazing);
        System.out.println("Pi: " + Pi);

        double Price = 30.70;
        double Tax = 7.29;
        int Quantity = 3;
        double Sum = 0;

        System.out.println("Price: " + Price);
        System.out.println("Tax: " + Tax);
        System.out.println("Quantity: " + Quantity);
        System.out.println("Sum: " + Sum);

        double total = Price + Tax * Quantity + Sum;
        System.out.println("Total: " + total);
    }
}
