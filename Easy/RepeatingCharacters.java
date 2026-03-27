//package Easy;
import java.util.*;
class RepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Frequency array for all ASCII characters (0–255)
        int[] freq = new int[256];

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Store only repeating characters in a list
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                list.add((char) i);
            }
        }

        // Sort characters based on frequency in descending order
        Collections.sort(list, (a, b) -> freq[b] - freq[a]);

        // Display result
        System.out.println("\nRepeating characters in descending order:");
        for (char ch : list) {
            System.out.println(ch + "->" + freq[ch]);
        }
    }
}

