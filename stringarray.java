package Practice;

import java.util.HashMap;
import java.util.Set;

public class StringArray {

    public static void check_number_of_characters_occurence(String a) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] string_parsed = a.toCharArray();
        for (int i = 0; i < string_parsed.length; i++) {
            if (map.containsKey(string_parsed[i])) {
                map.put(string_parsed[i], map.get(string_parsed[i]) + 1);
            } else {
                map.put(string_parsed[i], 1);
            }
        }
        System.out.println("Total Occurence  " + map);
        Set<Character> duplicate_keys = map.keySet();
        for (Character values : duplicate_keys) {
            if (map.get(values) > 1) {
                System.out.println("Character is  " + values + " and count is " + map.get(values));
            }
        }
    }

    public void reverseString(String test) {
        //Calling Function Recursively
        String reversed = "";
        char[] reversal = test.toCharArray();
        for (int i = reversal.length - 1; i >= 0; i--) {
            System.out.print(reversal[i]);
        }
    }

    public void substring_test(String substringString) {

    }


    public static void main(String args[]) {
        String lastname = "BhadanianiaBah";
        StringArray practice = new StringArray();
//        practice.check_number_of_characters_occurence(lastname);

        practice.reverseString(lastname);
    }
}
