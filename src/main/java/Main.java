public class Main {
    // groß und kleinbuchstaben umrechnen basierend auf den ascii werten.
    // kleinbuchstaben liegen 32 positionen über ihren großbuchstaben und umgekehrt
    public static char switchCase(char c) {
        if (c >= 'a' && c <= 'z') { // prüfen, ob c ein kleinbuchstabe ist; ASCII tabelle: a = 97 bis z = 122

            return (char) (c - 32); // 'a'(97) - 32 = 'A'(65)
        } else if (c >= 'A' && c <= 'Z') { //sonst prüfen, ob char c ein großbuchstabe ist; A = 65 bis Z=90
            return (char) (c + 32); // 'A'(65) + 32 = 'a'(97)
        } else {
            return c;
        }
    }

    public static char caesarChiffre(char c, int offset) {
        // Sollte c kein Buchstabe sein, soll der Wert von c unverändert zurückgegeben werden.
        if (!Character.isLetter(c)) { //wenn char c kein Letter ist, dann:

            return c; //gib c unverändert aus
        }

        if (Character.isLowerCase(c)) { // wenn c ein kleinbuchstabe ist
            int position = c - 'a'; // buchstabe in zahl umwandeln damit dann mithilfe der ASCII tabelle z.b. 'b' - 'a' = 98 - 97 = 1

            position = position + offset; //die verschiebung anwenden

            position = position % 26; // zirkulär machen, damit ...YXZABC.... funktioniert (überlauf)

            if (position < 0) { // prüfen, ob wert negativ ist, wenn ja, dann korrigieren
                position = position + 26;
            }

            return (char) ('a' + position); // zurück in buchstaben umwandeln

        } else { // genau das gleiche, nur mit toUpperCase im Grunde. also nun Großbuchstaben

            int position = c - 'A';
            position = position + offset;
            position = position % 26;
            if (position < 0) {
                position = position + 26;
            }
            return (char) ('A' + position);
        }
    }

    // public static char caesarChiffre(char c, int offset) {}

//Klar:    A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
//Geheim:  D E F G H I J K L M N O P Q R S T U V W X Y Z A B C


    public static boolean isPrime(int n) { //primzahl prüfen (größer als 1 und nur durch 1 und sich selbst teilbar)
        if (n <= 1) { //prüfe, ob zahl kleiner als, und oder '1' ist
            return false; //wenn ja, gib false zurück
        }
        for (int i = 2; i < n; i++) { //alle zahlen prüfen, von 2 bis n-1
            if (n % i == 0) { // wenn n durch i geteilt wird und der Rest = 0 ist ((7%2=1)- nicht teilbar & (8%2=0))- teilbar
                return false; //gib false aus, da eine zahl die nicht n ist durch n teilbar ist

            }
        }
        return true; //wenn die komplette schleife einmal durchgelaufen ist, weiß man dass es eine primzahl ist, da keine zahl gefunden wurde, die
    }

    public static int calculateSeries(int length) { //!5 = 1*2*3*4*5
        int ergebnis = 1; //festlgen des startwertes
        for (int i = 1; i <= length; i++) { // alle zahlen von startwert 1 bis des wertes von length durchmultiplizieren
            ergebnis = ergebnis * i; // pro schleifendurchlauf das ergbnis auf ergebnis * i setzen und das solange bis der wert von length erreicht wurde
        }
        return ergebnis; // wenn der wert von length ereicht wurde. das ergebnis ausgeben
    }

    public static double calculateSeriesDouble(int length) {
        double ergebnis = 1;
        for (double i = 1; i<= length; i++) {
            ergebnis = ergebnis * i;
        }
        return ergebnis;
    }


    public static void main(String[] args) {
        //ausführen von switchCase
        System.out.println("to.Upper-/lowerCase alternative START: ");
        System.out.println(Main.switchCase('a'));
        System.out.println(Main.switchCase('b'));
        System.out.println(Main.switchCase('A'));
        System.out.println(Main.switchCase('B'));
        System.out.println(Main.switchCase('1'));
        System.out.println(Main.switchCase('2'));
        System.out.println("DONE\n");

        //ausführen von Caesar Verschlüsselung
        System.out.println("Caesar Verschlüsselung start: \neinfache verschiebungen: ");
        System.out.println(Main.caesarChiffre('C', 3));
        System.out.println(Main.caesarChiffre('D', 3));

        System.out.println("zirkuläre verschiebungen:");
        System.out.println(Main.caesarChiffre('Z', 3));
        System.out.println(Main.caesarChiffre('Z', 4));

        System.out.println("negative Verschiebungen:");
        System.out.println(Main.caesarChiffre('A', -1));
        System.out.println(Main.caesarChiffre('A', -2));

        System.out.println("lowercase Verschiebungen:");
        System.out.println(Main.caesarChiffre('a', 1));
        System.out.println(Main.caesarChiffre('b', 1));

        System.out.println("fehler:");
        System.out.println(Main.caesarChiffre('1', 2));
        System.out.println(Main.caesarChiffre(' ', 2));
        System.out.println("Caesar done\n");

        //Primzahlen start:
        //kleine Primzahlen:
        System.out.println("Primzahlen Validierer");
        System.out.println("kleine zahlen:");
        System.out.println(Main.isPrime(2));
        System.out.println(Main.isPrime(3));
        System.out.println(Main.isPrime(4));
        System.out.println(Main.isPrime(5));
        System.out.println(Main.isPrime(6));
        System.out.println(Main.isPrime(7));

        //größere zahlen
        System.out.println("größere zahlen:");
        System.out.println(Main.isPrime(17));
        System.out.println(Main.isPrime(18));
        System.out.println(Main.isPrime(19));
        System.out.println(Main.isPrime(7457));
        System.out.println(Main.isPrime(7458));
        System.out.println(Main.isPrime(99991));
        System.out.println(Main.isPrime(99999));

        //sonderfälle
        System.out.println("sonderfälle:");
        System.out.println(Main.isPrime(0));
        System.out.println(Main.isPrime(1));
        System.out.println(Main.isPrime(-1));
        System.out.println("DONE");


        //fakulaet mit int:
        System.out.println("\nfakultät mit int berechnen");
        System.out.println(Main.calculateSeries(5));
        System.out.println(Main.calculateSeries(10));
        System.out.println(Main.calculateSeries(20));
        System.out.println(Main.calculateSeries(40));
        /*
        ab 40 wird nur noch "0" returned. ich denke es liegt an der begrenzung von intgers.
        edit: nach meiner recherche liegt das am sogenannten "INTEGER OVERFLOW". int kann nur zahlen bis 2.147.483.647 speichern, und fakultäten können sehr schnell sehr groß werden.
        Wenn eine zahl zu groß wird, überfließt (overflow) der speicher, was dazu führt, dass das Ergebnis negativ/ falsch wird.
        */
        System.out.println(Main.calculateSeries(41));
        System.out.println(Main.calculateSeries(42));
        System.out.println(Main.calculateSeries(43));
        System.out.println(Main.calculateSeries(44));
        System.out.println(Main.calculateSeries(45));
        System.out.println("int fakultaet fertig\n");


        //fakultaet mit double
        System.out.println("fakultaet mit double berechnen test 1:");

        //test 1:
        System.out.println(Main.calculateSeriesDouble(40));
        System.out.println(Main.calculateSeriesDouble(41));
        System.out.println(Main.calculateSeriesDouble(42));
        System.out.println(Main.calculateSeriesDouble(43));
        System.out.println(Main.calculateSeriesDouble(44));
        System.out.println(Main.calculateSeriesDouble(45));
        //ergebnis: es gab keinen overflow, wie es bei int der fall war.
        //ich denke, es liegt daran, dass double einen höheren Speicherbedarf hat, als int
        //test 2:
        System.out.println("\ntest2:");
        System.out.println(Main.calculateSeries(13) - Main.calculateSeriesDouble(13));
        System.out.println(Main.calculateSeries(14) - Main.calculateSeriesDouble(14));
        //erwartung: da differenz, ist der wert 0.
        // ergebnis: 14 - 14 ist nicht 0 bzw. sogar der doppelte wert von 13 - 13
        // das liegt wohl daran, dass dobule nur eine bestimmte menge an nachkommastellen genau speichert.
        // der rest danach ist gerundet, was wohl den "fehler" entstehen lässt.
        // dobule kann weit aus mehr zahlen speichern, aber nur 15-17 nachkommastellen genau..
        System.out.println("DONE");
    }
}
