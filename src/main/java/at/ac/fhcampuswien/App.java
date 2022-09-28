package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        int counter = 0;
        for (int i = 0; i < 22; i++) {
            System.out.print(counter);
            counter++;
            if (counter == 10) {
                counter = 0;
            }
        }
        System.out.println("");
        String output =
        "         __" + System.lineSeparator() +
        " _(\\    |@@|" + System.lineSeparator()   +
        "(__/\\__ \\--/ __"+ System.lineSeparator() +
        "   \\___|----|  |   __"+ System.lineSeparator() +
        "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
        "       /\\__/\\ \\__O (__" + System.lineSeparator() +
        "      (--/\\--)    \\__/" + System.lineSeparator() +
        "      _)(  )(_" + System.lineSeparator() +
        "     `---''---`" + System.lineSeparator();
        System.out.print(output);
    }

    //todo Task 3
    public void sumOfLiterals(){
        char erstes = 'Z';
        int zweites = 0xface;
        int drittes = 012;
        long viertes = 80L;
        float fuenftes = 44e-1f;
        float sechstes = 5.5f;
        double siebtes = 8.88e1;
        double achtes = 99.9;
        int summe = (int)erstes + zweites + drittes + (int) viertes + (int) fuenftes + (int) sechstes + (int) siebtes + (int) achtes;
        System.out.println(summe);

    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int firstDigit = scanner.nextInt();
        int secondDigit = scanner.nextInt();
        int sum = firstDigit + secondDigit;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int firstDigit = scanner.nextInt();
        int secondDigit = scanner.nextInt();
        System.out.println("Before Swap:");
        System.out.println("x: y: After Swap:");
        firstDigit = firstDigit ^ secondDigit;
        secondDigit = firstDigit ^ secondDigit;
        firstDigit = firstDigit ^ secondDigit;
        System.out.println("x: " + firstDigit);
        System.out.println("y: " + secondDigit);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int firstDigit = scanner.nextInt();
        int secondDigit = scanner.nextInt();
        System.out.print("n1: ");
        System.out.print("n2: ");
        if (firstDigit == secondDigit) {
            System.out.println("n1 == n2");
        } else if (firstDigit > secondDigit) {
            System.out.println("n1 > n2");
        }else if (firstDigit < secondDigit) {
            System.out.println("n2 > n1");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int revenue = scanner.nextInt();

        if (revenue < 0 || revenue >= 100000) {
            System.out.println("Invalid Revenue");
        } else if (revenue >= 0 && revenue < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (revenue < 50000 && revenue >= 20000) {
            System.out.println("Average Sales Revenue");
        } else if (revenue < 80000 && revenue >= 50000) {
            System.out.println("Good Sales Revenue");
        }else if (revenue < 100000 && revenue >= 80000) {
            System.out.println("Excellent Sales Revenue");
        }

    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        float userinput = scanner.nextFloat();

        if (userinput == 1) {
            System.out.println("Your Commission Rate was set to 0.01");
        } else if (userinput == 2) {
            System.out.println("Your Commission Rate was set to 0.02");
        }else if (userinput == 3) {
            System.out.println("Your Commission Rate was set to 0.03");
        }else if (userinput == 4) {
            System.out.println("Your Commission Rate was set to 0.04");
        }else {
            System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scanner.nextInt();

        if (year % 4 != 0) {
            System.out.println("Not a Leapyear");
        } else if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("Leapyear");
            }else {
                System.out.println("Not a Leapyear");
            }
        }else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int userinput = scanner.nextInt();

        if (userinput < 999 && userinput > 0) {
            int ones_place = userinput % 10;
            userinput = userinput / 10;
            int tens_place = userinput % 10;
            userinput = userinput / 10;
            int hundreds_place = userinput;
            System.out.println(ones_place + "" + tens_place + "" + hundreds_place);
        }
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}