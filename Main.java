import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź pierwszą liczbę:");
        double pierwszaLiczba = scanner.nextDouble();

        System.out.println("Wprowadź drugą liczbę:");
        double drugaLiczba = scanner.nextDouble();

        System.out.println("Wybierz operację: +, -, *, /");
        char operacja = scanner.next().charAt(0);

        double wynik;

        if (operacja == '+') {
            wynik = dodawanie(pierwszaLiczba, drugaLiczba);
        } else if (operacja == '-') {
            wynik = odejmowanie(pierwszaLiczba, drugaLiczba);
        } else if (operacja == '*') {
            wynik = mnozenie(pierwszaLiczba, drugaLiczba);
        } else if (operacja == '/') {
            if (drugaLiczba != 0) {
                wynik = dzielenie(pierwszaLiczba, drugaLiczba);
            } else {
                System.out.println("Błąd: Dzielenie przez zero!");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Błąd: Nieznana operacja!");
            scanner.close();
            return;
        }

        System.out.println("Wynik: " + wynik);
        scanner.close();
    }

    public static double dodawanie(double a, double b) {
        return a + b;
    }

    public static double odejmowanie(double a, double b) {
        return a - b;
    }

    public static double mnozenie(double a, double b) {
        return a * b;
    }

    public static double dzielenie(double a, double b) {
        return a / b;
    }
}