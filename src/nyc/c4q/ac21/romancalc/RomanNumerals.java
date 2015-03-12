package nyc.c4q.ac21.romancalc;

/**
 * Code to convert to and from Roman numerals.
 * Formats a number in Roman numerals.
 *
 * @param value The value to format.
 * @return The value in Roman numerals.
 * // 1000, 900, 800, 700, 600, 500, 400, 300, 200, 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 9,5, 4, 1
 */


public class RomanNumerals {
    public static String format(int value) {
        if (value <= 0 || value > 3999)
            return "Error: not a valid Roman Numeral";
        String num$ = "";               //represents integer # inputted.

        while (value >= 1000) {        //Start with largest place. 1000's place.
            num$ += "M";               //Print M for each multiple of 1000;
            value = value - 1000;      //Remove 1000 from number. ex: 1984 = 1000 + 900 + 80 + 4
        }                                       //MCMLXXIV
        while (value >= 900) {
            num$ += "CM";   //         //100 less than a 1000. ex: 984 = 900 (CM) + 80 + 4
            value = value - 900;
        }
        while (value >= 500) {
            num$ += "D";
            value = value - 500;
        }
        while (value >= 400) {
            num$ += "CD";
            value = value - 400;
        }
        while (value >= 100) {
            num$ += "C";
            value -= 100;
        }
        while (value >= 90) {
            num$ += "XC";
            value -= 90;
        }
        while (value >= 60) {
            num$ += "LX";
            value -= 60;
        }
        while (value >= 50) {
            num$ += "L";
            value -= 50;
        }
        while (value >= 40) {
            num$ += "XL";
            value -= 40;
        }
        while (value >= 30) {
            num$ += "XXX";
            value -= 30;
        }
        while (value >= 20) {
            num$ += "XX";
            value -= 20;
        }
        while (value >= 10) {
            num$ += "X";
            value -= 10;
        }
        while (value >= 9) {
            num$ += "IX";
            value -= 9;
        }
        while (value >= 5) {
            num$ += "V";
            value -= 5;
        }
        while (value >= 4) {
            num$ += "IV";
        }
        while  (value >= 1) {
            num$ += "I";
            value -= 1;
        }
        return num$;
    }

    /**
     * Parses a number in Roman numerals.
     * @param number
     *   The number to parse.
     * @return
     *   The value, or -1 if the number isn't in Roman numerals.
     */
    public static int parse(String number) {
        // TODO: Group 2: Write this function!
        
        // You will need:
        //   `number.length()` gives the length (number of characters) of the number
        //   `number.charAt(i)` gives the i'th character
        
        return -1;
    }

    public static void main(String[] argv) {
        // TODO: Group 3: Write this function!
        // It should test that format() and parse() work correctly.
<<<<<<< HEAD

        Scanner userInput = new Scanner(System.in);





        System.out.println("Welcome to the Roman calculator. Type in a roman numeral");
        int leftNumber = userInput.nextInt();

        System.out.println("Please type a second roman numeral.");
        int rightNumber = userInput.nextInt();

        System.out.println("Please type an operator.");
        userInput.nextFloat();

        String operation = userInput.next();
        if (operation.equals("+")) {
            System.out.println(leftNumber+rightNumber);
        } else if (operation.equals("-")) {
            System.out.println(leftNumber-rightNumber);
        } else if (operation.equals("/")) {
            System.out.println(leftNumber/rightNumber);
        } else if (operation.equals("*")) {
            System.out.println(leftNumber*rightNumber);
        } else if (operation.equals("%")) {
            System.out.println(leftNumber%rightNumber);
        } else {
            System.out.println("Invalid operation.");
        }









=======
        System.out.print(format(18)); /* it should return XVIII*/
        System.out.print(format(29)); /* it should return XXIX*/
        System.out.print(format(34)); /* it should return XXXIV*/
        System.out.print(format(46)); /* it should return XLVI*/
        System.out.print(format(89)); /* it should return LXXXiX*/
        System.out.print(format(846)); /* it should return DCCCXLVI*/
        System.out.print(format(1999)); /* it should return MCMXCIX*/
        System.out.print(format(2420)); /* it should return MMCDXX*/
        System.out.print(format(3454)); /* it should return MMMCDLIV*/
        System.out.print(format(3999)); /* it should return MMMCMXCIX*/



        System.out.print(parse("XVIII")); /* it should return 18*/
        System.out.print(parse("XXIX")); /* it should return 29*/
        System.out.print(parse("XXXIV")); /* it should return 34*/
        System.out.print(parse("XLVI")); /* it should return 46*/
        System.out.print(parse("LXXXiX")); /* it should return 89*/
        System.out.print(parse("DCCCXLVI")); /* it should return 846*/
        System.out.print(parse("MCMXCIX")); /* it should return 1999*/
        System.out.print(parse("MMCDXX")); /* it should return 2420*/
        System.out.print(parse("MMMCDLIV")); /* it should return 3454*/
        System.out.print(parse("MMMCMXCIX")); /* it should return 3999*/
>>>>>>> 868ddef1ea1616a139091f630166965f2d074112
    }
}
