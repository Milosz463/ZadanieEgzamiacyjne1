public class Notatka {
    public static int licznikNotatek = 0;
    public int indentyfikator;
    public String tytul;
    public String tresc;

    public Notatka() {
        indentyfikator = 0;
        tytul = "";
        tresc = "";
    }

    public Notatka(String tytul, String tresc) {
        licznikNotatek++;
        indentyfikator = licznikNotatek;
        this.tytul = tytul;
        this.tresc = tresc;
    }

    public void wyswietl() {
        if (tresc.equals("")) {
            System.out.println("Dodaj cos do noatki");
        } else {
            System.out.println("Tytul: " + tytul + "Tresc " + tresc);
        }
    }

    public void wypisz() {
        System.out.println(tytul + "; " + tresc + "; " + indentyfikator+"; "+licznikNotatek);
    }
}
