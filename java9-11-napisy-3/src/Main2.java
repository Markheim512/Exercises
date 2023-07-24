public class Main2 {
    public static void main(String[] args) {
        // var regex = "[abc]"; // badany napis ma byc jedna litera: a, b lub c
        // var regex = "[^abc]"; // badany napis ma byc jedna litera ale NIE: a, b oraz c
        // var regex = "[a-z]"; // jedna mala litera
        // var regex = "[A-Z]"; // jedna duza litera
        // var regex = "[a-zA-Z]"; // jedna mala lub duza litera
        // var regex = "[a-h&&[^bg]]"; // jedna mala litera z przedzialu a-h ale bez b oraz g
        // var regex = "[a-h&&[^c-f]]"; // jedna mala litera z przedzialu a-h ale bez przedzialu c-f
        // var regex = "[0-9]"; // jedna cyfra
        // var regex = "[3-7]"; // jedna cyfra z przedzialu 3-7
        // var regex = "[a-zA-Z0-9]"; // jedna cyfra lub litera
        // var regex = "\\d"; // jedna cyfra, to samo co [0-9] - wyrazenie regularne to \d
        // ale w napisie Java nie mozesz zapisac jednego \ bo razem z d Java mysli ze to
        // znak  specjalny, ktory nie istnieje wiec musisz pisac \\d
        // var regex = "\\D";  // przeciwienstwo \\d czyli znak ma nie byc liczba
        // var regex = "\\w";  // to samo co [a-zA-Z_0-9]
        // var regex = "\\W";  // przeciwienstow \\w
        // var regex = "\\s";  // jeden dowolny bialy znak
        // var regex = "\\S";  // przeciwienstwo \\s
        // var regex = ".";  // jeden dowolny znak
        // var regex = "\\.";  // kiedy znak specjalny poprzedzisz \\ to wtedy bedzie on
        //  interpretowany jako ten znak, czyli mamy w tym przypadku miec jedna kropke

        var regex = "^[a-z]?$"; // 0 lub 1 mala litera
        // ustawiasz sie na regex (kiedy zostal rozpoznany jako regex) i naciskasz alt + enter
        // potem wybierasz Check Regexp

        // var regex = "[a-z]*";  // zero lub wiecej malych literek
        // var regex = "[a-z]+";  // co najmniej jedna mala literka
        // var regex = "[a-z]{4}";  // dokladnie 4 male litery
        // var regex = "[a-z]{4,6}";  // dokladnie od 4 do 6 malych liter
        // var regex = "[a-z]{4,}";  // co najmniej 4 litery

        // var regex = "(ala|ola)"; // napis ma byc albo "ala" albo "ola"
        // var regex = "(ala|ola){3}"; // napis ma byc albo "ala" albo "ola" i tak 3 razy

        // napis ma sie zaczynac z duzej litery a potem wszystko jedno
        // var regex = "^[A-Z]"; // ^ na poczatku mowi nam ze napis ma sie zaczynac od
        // var regex = "[A-Z]$"; // $ na koncu mowi ze napis ma sie konczyc na to co podasz
        // var regex = "^[A-Z].*\\d$"; // napis ma sie zaczynac od duzej litery i konczyc na cyfre
        var text = "alaolaala";
        System.out.println(text.matches(regex));
    }
}
