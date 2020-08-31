import java.util.Scanner;

public class Calculator {
    static float firstNumberFloat = 0;
    static float secondNumberFloat = 0;
    static int firstNumberInt = 0;
    static int secondNumberInt = 0;

    public static void main(String[] args) {
        boolean terminate = false;  // Mir ist das mit der Schleife und dem Schleifenende nicht ganz klar. INFO?
        Scanner scanner = new Scanner(System.in);

       do {
            System.out.println("Would you like to make floating point calculations?");
            System.out.println("Type y for yes and anything else for integer calculations");
            if (scanner.nextLine().equals("y")) {
                calculationFloat();
            } else {
                calculationInt();
            }

           System.out.println("Would you like to make another calculation? Press y for yes.");
           String input = scanner.nextLine();   // Hier wird der Inhalt des Scanners in eine Variable gegeben?
           if (!input.equals("y")) {
                terminate = true;
           }

        } while (!terminate);
        System.out.println("Thank you for using the calculator. See you soon!");

    }

    public static void calculationFloat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the first number:");
        firstNumberFloat = Float.parseFloat(scanner.nextLine());
        System.out.println("Type in the second number:");
        secondNumberFloat = Float.parseFloat(scanner.nextLine());
        System.out.println("You can make the following calculations:");
        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. divide");
        System.out.println("4. modulo");
        System.out.println("5. pythagoras you can calculate the hypotenuse c");

        System.out.println("Enter a number to select the calculation method.");
        int i = Integer.parseInt(scanner.nextLine());
        switch (i) {
            case 1:
                float result = firstNumberFloat + secondNumberFloat;  //float result muss dur einmal deklariert werden und kann das mit anderen Ergebnissen aus Cases befüllt werden.
                System.out.println("Calculating: " + firstNumberFloat + " + " + secondNumberFloat);
                System.out.println("The solution is: " + result);
                break;
            case 2:
                result = firstNumberFloat - secondNumberFloat;
                System.out.println("Calculating: " + firstNumberFloat + " - " + secondNumberFloat);
                System.out.println("The solution is: " + result);
                break;
            case 3:
                result = firstNumberFloat / secondNumberFloat;
                System.out.println("Calculating: " + firstNumberFloat + " / " + secondNumberFloat);
                System.out.println("The solution is: " + result);
                break;
            case 4:
                result = firstNumberFloat % secondNumberFloat;
                System.out.println("Calculating: " + firstNumberFloat + " % " + secondNumberFloat);
                System.out.println("The solution is: " + result);
                break;
            case 5:
                result = (float) Math.sqrt(Math.pow(firstNumberFloat, 2) + Math.pow(firstNumberFloat, 2));  // Warum ist das Ergebnis double und warum muss ich zu float casten?
                System.out.println("Calculating: Wurzel aus (" + firstNumberFloat + "^2 " + secondNumberFloat + "^2 )");
                System.out.println("The solution is: " + result);
                break;

            default:
                System.out.println("There seems to be a problem.");
                return;

        }

            }



    public static void calculationInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the first number:");
        firstNumberInt = Integer.parseInt(scanner.nextLine());
        System.out.println("Type in the second number:");
        secondNumberInt = Integer.parseInt(scanner.nextLine());
        System.out.println("You can make the following calculations:");
        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. divide");
        System.out.println("4. modulo");
        System.out.println("5. pythagoras you can calculate the hypotenuse c");

        System.out.println("Enter a number to select the calculation method.");
        int i = Integer.parseInt(scanner.nextLine());
        switch (i) {
            case 1:
                int resultInt = firstNumberInt + secondNumberInt;  //Beim Rechnen gibt es einen Fehler mit int resultInt. WARUM?
                System.out.println("Calculating: " + firstNumberInt + " + " + secondNumberInt);
                System.out.println("The solution is: " + resultInt);
                break;
            case 2:
                resultInt = firstNumberInt - secondNumberInt;
                System.out.println("Calculating: " + firstNumberInt + " - " + secondNumberInt);
                System.out.println("The solution is: " + resultInt);
                break;
            case 3:
                resultInt = firstNumberInt / secondNumberInt;
                System.out.println("Calculating: " + firstNumberInt + " / " + secondNumberInt);
                System.out.println("The solution is: " + resultInt);
                break;
            case 4:
                resultInt = firstNumberInt % secondNumberInt;
                System.out.println("Calculating: " + firstNumberInt + " % " + secondNumberInt);
                System.out.println("The solution is: " + resultInt);
                break;
            case 5:
                resultInt = (int) Math.sqrt(Math.pow(firstNumberInt, 2) + Math.pow(firstNumberInt, 2));
                System.out.println("Calculating: Wurzel aus (" + firstNumberInt + "^2 " + secondNumberInt + "^2 )");
                System.out.println("The solution is: " + resultInt);
                break;
            default:
                System.out.println("There seems to be a problem.");
                return;
        }

        }


}

