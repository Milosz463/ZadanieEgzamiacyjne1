import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Wpisz tytul");
        String tytul= sc.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Wpisz tresc");
        String tresc=sc2.nextLine();

        Notatka notatka1=new Notatka(tytul, tresc);
        notatka1.wyswietl();
        notatka1.wypisz();

        Notatka notatka2=new Notatka();
        notatka2.wyswietl();
        notatka2.wypisz();
    }
}