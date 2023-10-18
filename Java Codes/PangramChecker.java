import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        boolean isPangram = checkPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        sc.close();
    }

    public static boolean checkPangram(String s) {
        boolean[] visited = new boolean[26];
        int uniqueCharacters = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('A' <= c && c <= 'Z') {
                c = (char) (c - 'A' + 'a');
            }
            if ('a' <= c && c <= 'z') {
                int index = c - 'a';
                if (!visited[index]) {
                    visited[index] = true;
                    uniqueCharacters++;
                    if (uniqueCharacters == 26) {
                        return true; // All letters have been visited.
                    }
                }
            }
        }
        
        return false;
    }
}

