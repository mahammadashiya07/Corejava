import java.util.*;

public class PhoneLetterCombinations {

    static Map<Character, String> phone = new HashMap<>();

    static {
        phone.put('2', "abc");
        phone.put('3', "def");
        phone.put('4', "ghi");
        phone.put('5', "jkl");
        phone.put('6', "mno");
        phone.put('7', "pqrs");
        phone.put('8', "tuv");
        phone.put('9', "wxyz");
    }

    static void generate(String digits, int index,
                         String current, List<String> result) {

        if (index == digits.length()) {
            result.add(current);
            return;
        }

        String letters = phone.get(digits.charAt(index));

        for (char ch : letters.toCharArray()) {
            generate(digits, index + 1,
                     current + ch, result);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone digits (2-9): ");
        String digits = sc.nextLine();

        List<String> result = new ArrayList<>();

        if (digits.length() > 0) {
            generate(digits, 0, "", result);
        }

        System.out.println("Letter Combinations:");

        for (String combination : result) {
            System.out.println(combination);
        }

        sc.close();
    }
}