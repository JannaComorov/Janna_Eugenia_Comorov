package homework_nr_3;

public class homework_nr_3 {
    public static void main(String[] args) {
        int month = 3;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
        }
        System.out.println("Numerele de la 100 la 1000 care sunt divizibile la 5");
        for (int i = 100; i <= 1000; i++){
            if (i % 5 == 0){
                System.out.println(i + " ");
            }

            System.out.println();

        }
        double sum = 0;
        for (int i = 1; i <= 97; i += 2) {
            sum += (double)i / (i + 2);
        }
        System.out.println("Suma seriei: " + sum);
    }
}
