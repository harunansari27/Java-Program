public class IntegerToRoman {

    public String intToRoman(int num) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[num / 1000]
                + hundreds[(num % 1000) / 100]
                + tens[(num % 100) / 10]
                + units[num % 10];
    }

    // main method to test the code
    public static void main(String[] args) {
        IntegerToRoman converter = new IntegerToRoman();

        // test cases
        System.out.println(converter.intToRoman(3));     // III
        System.out.println(converter.intToRoman(58));    // LVIII
        System.out.println(converter.intToRoman(1994));  // MCMXCIV
        System.out.println(converter.intToRoman(2023));  // MMXXIII
        System.out.println(converter.intToRoman(3999));  // MMMCMXCIX (max valid Roman numeral)
    }
}
