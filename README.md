In dieser Übung befassen Sie sich mit den unterschiedlichen Datentypen in Java.

# Aufgabe 1

Implementieren Sie in der Klasse `Main` eine Methode `public static char switchCase(char c)`. Diese soll für das übergebene Zeichen `c` zurückgeben:

- Den dazu passenden Großbuchstaben, falls es sich um einen Kleinbuchstaben handelt (für c='d' soll also 'D' zurückgegeben werden)
- Den dazu passenden Kleinbuschstaben, falls es sich um einen Großbuchstaben handelt (für c='K' soll also 'k' zurückgegeben werden)
- In allen anderen Fällen den Wert 0 (Vorsicht, den Wert 0, nicht den Buchstaben '0'!)

Verwenden Sie bitte *nicht* die eingebauten Methoden `toUpperCase` u. Ä. von Java, sondern nur Rechenoperationen!

Beachten Sie bitte: Wenn Sie eine Rechenoperation durchführen, deren Ergebnis eventuell nicht in einen `char` passt, macht Java automatisch aus dem Ergebnis einen `int`. Wenn Sie das Ergebnis auf jeden Fall in einem `char` behalten wollen, müssen Sie den Datentyp nochmal davorschreiben. Also:

```java
public static void bla(char x) {
    x = x-5; // Fehler: Java sagt: "x-5 könnte ein negativer Wert sein, das muss in einen int und nicht in einen char"
    x = (char)(x-5); // Funktioniert. x-5 ist immer noch ein int, aber mit dem (char) davor sagt man: "Pack das bitte trotzdem in einen char"
}
```

# Aufgabe 2

Implementieren Sie in der Klasse `Main` eine Methode `public static char caesarChiffre(char c, int offset)`, die den übergebenen Buchstaben nach der Methode der [Caesar-Verschlüsselung](https://de.wikipedia.org/wiki/Caesar-Verschl%C3%BCsselung) mit einer Verschiebung von `offset` verschlüsselt. Bitte beachten Sie, dass die Verschiebung zirkulär ist - nach Z geht es bei A weiter! 

Beachten Sie bitte Groß- und Kleinschreibung - diese soll erhalten bleiben.

Sollte `c` kein Buchstabe sein, soll der Wert von `c` unverändert zurückgegeben werden.

# Aufgabe 3

Implementieren Sie in der Klasse `Main` eine Methode `public static boolean isPrime(int n)`, die zurückgibt:

- `true`, falls die Zahl eine Primzahl ist
- `false`, falls die Zahl keine Primzahl ist

Hinweis: Der Datentyp `boolean` kann nur zwei unterschiedliche Werte annehmen: `true` oder `false`. Das Ergebnis eines Vergleichs ist beispielsweise immer ein `boolean`, und alles, was in einer Bedingung steht, muss ein `boolean` sein:

```java
public static void booleanExample() {
    boolean x = (1 == 5); // x ist false, da 1 nicht gleich 5 ist.
    for (int i = 0; i < 100; i++) {
        if (isPrime(i)) { // Wenn Sie die o.g. Methode implementiert haben, ist die Bedingung nur erfüllt, wenn sie Zahl eine Primzahl ist = wenn isPrime(i) true zurückgibt.
            System.out.println(i);
        }
    }
}
```

# Aufgabe 4

Implementieren Sie in der Klasse `Main` eine Methode `public static int calculateSeries(int length)`, die die [Fakultät](https://de.wikipedia.org/wiki/Fakult%C3%A4t_(Mathematik)) der übergebenen Zahl berechnet und zurückgibt. Falls Sie wissen, was eine rekursive Implementation ist: Verwenden Sie bitte keine Rekursion für die Lösung!

Lassen Sie sich das Ergebnis für die folgenden Werde von length ausgeben: 5, 10, 20, 40, 41, 42, 43, 44, 45. Was fällt Ihnen auf? Woran könnte das liegen?

# Aufgabe 5

Implementieren Sie in der Klasse `Main` eine Methode `public static double calculateSeriesDouble(int length)`, die die [Fakultät](https://de.wikipedia.org/wiki/Fakult%C3%A4t_(Mathematik)) der übergebenen Zahl berechnet und zurückgibt. Verwenden Sie diesmal für die Berechnung einen `double` anstatt von einem `int`.

Lassen Sie sich das Ergebnis für die folgenden Werde von length ausgeben: 40, 41, 42, 43, 44, 45. Was fällt Ihnen im Vergleich zur letzten Lösung auf? Woran könnte das liegen?

Lassen Sie sich die Werte der folgenden beiden Differenzen ausgeben:

* `calculateSeries(13) - calculateSeriesDouble(13)`
* `calculateSeries(14) - calculateSeriesDouble(14)`

Was hätten Sie erwartet, was können Sie beobachten? Woran könnte das liegen?

# Aufgabe 6 (Zusatzaufgabe, freiwillig)

Implementieren Sie in der Klasse `Main` eine Methode `public static void caesarChiffre(String text, int offset)`, die einen übergebenen Text nach der Methode der [Caesar-Verschlüsselung](https://de.wikipedia.org/wiki/Caesar-Verschl%C3%BCsselung) verschlüsselt ausgibt.

Hinweis: Sie können die Länge eines Strings mit der Methode `.length()` bekommen, und mit `.charAt(x)` auf das x-te Zeichen eines String zugreifen. Einen String können Sie also beispielsweise so Zeichen für Zeichen ausgeben:

```java
public static void printStrin(String text) {
    for(int i=0; i<text.length(); i++) {
        System.out.print(text.charAt(i));
    }
}
```

