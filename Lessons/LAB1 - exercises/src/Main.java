
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        String imie = "Maciek";
        int wiek = 20;
        System.out.println("Moje imie to: " + imie + ", natomiast wiek: " + wiek + "lat.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj 1 liczbę: ");
        int liczba1 = scanner.nextInt();
        System.out.print("Podaj 2 liczbę: ");
        int liczba2 = scanner.nextInt();
        wyliczLiczby(liczba1, liczba2);

        System.out.print("Podaj liczbę do sprawdzenia jej parzystości: ");
        int liczba3 = scanner.nextInt();
        boolean czyLiczbaJestParzysta = sprawdzenieParzystosci(liczba3);
        if(czyLiczbaJestParzysta){
            System.out.println(liczba3 + " jest liczbą parzysta");
        } else{
            System.out.println(liczba3 + " jest liczbą nieparzystą");
        }

        System.out.print("Podaj liczbę do sprawdzenia czy jest podzielna przez 3 i 5: ");
        int liczba4 = scanner.nextInt();
        boolean podzielnosc = czyLiczbaJestPodzielna(liczba4);
        if(podzielnosc){
            System.out.println(liczba4 + " jest liczbą podzielną przez 3 i 5 ");
        } else {
            System.out.println(liczba4 + " jest liczbą niepodzielną przez 3 i 5 ");
        }

        System.out.print("Podaj liczbę by podnieść ją do sześcianu: ");
        int liczba5 = scanner.nextInt();
        int szescianLiczby = liczbaDoPotegi3(liczba5);
        System.out.println(liczba5 + " podniesiona do 3 potęgi wynosi " + szescianLiczby);

        System.out.print("Podaj liczbę by spierwiastkować ją do kwadratu: ");
        double liczba6 = scanner.nextInt();
        double pierwiastekKwadratowy = pierwiastekKwadratowyZLiczby(liczba6);
        System.out.println("Pierwiastek kwadratowy z " + liczba6 + " wynosi " + pierwiastekKwadratowy);

        System.out.println("Podaj zakres przedziału, aby program wylosował z niego boki i sprawdził czy można utworzyć z nich trójkąt: ");
        System.out.print("Podaj 1 liczbę: ");
        float min = scanner.nextFloat();
        System.out.print("Podaj 2 liczbę: ");
        float max = scanner.nextFloat();
        float odcinekA = ThreadLocalRandom.current().nextFloat(min, max);;
        float odcinekB = ThreadLocalRandom.current().nextFloat(min, max);;
        float odcinekC = ThreadLocalRandom.current().nextFloat(min, max);;
        boolean czyDaSieZrobicTrojkatProstokatny = czyMoznautworzycTrojkatProstokatnyZWylosowanegoPrzedzialu(odcinekA, odcinekB, odcinekC);
        System.out.println(czyDaSieZrobicTrojkatProstokatny);
        while (czyDaSieZrobicTrojkatProstokatny){
            System.out.println(odcinekA + " " + odcinekB + " " + odcinekC);
            break;
        }
    }

    public static void wyliczLiczby(int a, int b){
        int dodawanie = a + b;
        int odejmowanie = a - b;
        int mnozenie = a * b;
        System.out.println("Suma: " + dodawanie);
        System.out.println("Różnica: " + odejmowanie);
        System.out.println("Iloczyn: " + mnozenie);
    }

    public static boolean sprawdzenieParzystosci(int liczba){
        if(liczba % 2 == 0) {
            return true;
        } else {
                return false;
            }
        }

    public static boolean czyLiczbaJestPodzielna(int liczba){
        return(liczba % 3 == 0 && liczba % 5 == 0);
    }

    public static int liczbaDoPotegi3(int liczba){
        return liczba * liczba * liczba;
    }

    public static double pierwiastekKwadratowyZLiczby(double liczba) {
        return Math.sqrt(liczba);
    }

    public static boolean czyMoznautworzycTrojkatProstokatnyZWylosowanegoPrzedzialu(float odcinekA, float odcinekB, float odcinekC){
        if (odcinekA <= 0 || odcinekB <= 0 || odcinekC <= 0) {
            return false;
        }
        float odcinki[] = {odcinekA, odcinekB, odcinekC};
        Arrays.sort(odcinki);
        if (odcinki[0] + odcinki[1] > odcinki[2]){
            return true;
        }
            return false;
        }
}




