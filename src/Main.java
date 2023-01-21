public class Main {
    public static void main(String[] args) {
        System.out.println("Tipi di dati in Java: ");

        /*
         * Tipi di dati: Primitivi----Reference
         *
         * - boolean | true : false | 1bit [primitivo]
         *
         * - byte | -128 : 127 | 1 byte [primitivo]
         *
         * - short | -32768 : 32767 | 2 bytes [primitivo]
         *
         * - int | -2 miliardi : 2 miliardi | 4 bytes [primitivo]
         *
         * - long | -9 quintiglioni : 9 quintiglioni | 8 bytes [primitivo]
         *
         * --------------------------------------------------
         *
         * - float | numero con 6/7 cifre decimali 5.894635f | 4 bytes [primitivo]
         *
         * - double | numero con 15 cifre decimali 5.256984552361458 | 8 byte [primitivo]
         *
         *-------------------------------------------------------------------
         *
         * - char | singolo carattere/Lettera/ASCII 'b' | 2 bytes [primitivo]
         *
         * - String | sequenza di caratteri "ciao sono io" | variabile [referenza]
         *
         * -----------------------------------------------------------
         *
         * - Differenza tra primitivi e reference (iniziale e attributi disponibili)
         */


        boolean ilBoolean = true; // (false)

        byte ilByte = 127; // -128 a +127

        short loShort = -32768; // -32768 a +32767

        int ilInt = 2000_000_000; /* -2000000000 e rotti a +2000000000 e rotti
                                     (per leggerlo meglio _ under score) */

        long ilLong = 89_895_959_616_584L;

        /*--------------------------------------------------------------------------------------*/

        float ilFloat = 5.5698745f;	// 7 cifre decimali da terminare con f

        double ilDouble = 5.523145698523256; // 15 cifre decimali

        /*--------------------------------------------------------------------------------------*/

        char ilChar = 'b'; // un solo carattere tra singoli apici

        String laStringa = "ciao sono io"; // stringa insieme di caratteri (testo) messo tra doppi apici
        /*
         * Differenza tra primitivi e reference:
         *
         * - Primitivi dati forniti da java standard (iniziano con la minuscola)
         *
         * - Reference tipi di dati complessi quasi tutti creati da noi (iniziano tutti
         * con la maiuscola) e si differenziano anche dagli attributi disponibili o metodi
         */
        System.out.println();
        //laStringa.toUpperCase()
        System.out.println(laStringa.toUpperCase());
        //Con questa funzione stringa stampo tutto maiuscolo esempi di molti
    }
}