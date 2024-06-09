import java.util.*;//t provides access 
//to commonly used classes such as Scanner, ArrayList, LinkedList, HashMap, HashSet, and many more.
//a class named soulution
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();

        TreeSet<Num> nums = new TreeSet<>();
        /*
        TreeSet is an implementation of the SortedSet interface, 
        which automatically sorts the elements in ascending order.
        */
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element #" + (i+1) + ": ");
            int num = in.nextInt();
            nums.add(new Num(num));
        }

        System.out.println("Sorted Roman Numerals:");
        for (Num num : nums) {
            System.out.println(num.getRomanNumeral());
        }
    }

    private static class Num implements Comparable<Num> {
        private static final String[][] ROMAN_NUMERALS = {
                { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" },
                { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" },
                { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" },
                { "", "M", "MM", "MMM" }
        };

        private int num;
        private String romanNumeral;

        public Num(int num) {
            this.num = num;
            this.romanNumeral = convertToRomanNumeral(num);
        }

        private String convertToRomanNumeral(int num) {
            StringBuilder sb = new StringBuilder();
            sb.append(ROMAN_NUMERALS[3][num / 1000]);
            sb.append(ROMAN_NUMERALS[2][num / 100 % 10]);
            sb.append(ROMAN_NUMERALS[1][num / 10 % 10]);
            sb.append(ROMAN_NUMERALS[0][num % 10]);
            return sb.toString();
        }

        public String getRomanNumeral() {
            return romanNumeral;
        }

        @Override
        public int compareTo(Num other) {
            return this.romanNumeral.compareTo(other.romanNumeral);
        }
    }
}