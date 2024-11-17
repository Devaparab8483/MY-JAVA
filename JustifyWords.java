import java.util.*;

public class JustifyWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of words
        int K = Integer.parseInt(scanner.nextLine().trim());
        String[] words = new String[K];

        for (int i = 0; i < K; i++) {
            words[i] = scanner.nextLine().trim();
        }

        // Read the number of lines (N) and maximum length per line (M)
        String[] lineLimits = scanner.nextLine().trim().split(" ");
        int N = Integer.parseInt(lineLimits[0]);
        int M = Integer.parseInt(lineLimits[1]);

        int totalWords = 0;
        int currentLine = 1;
        int currentLength = 0;

        for (String word : words) {
            int wordLength = word.length();

            // If the word itself exceeds M, skip it (though not expected based on problem constraints)
            if (wordLength > M) {
                continue;
            }

            // Check if the word can be added to the current line
            if (currentLength == 0) {
                // Line is empty, add the word
                currentLength = wordLength;
            } else if (currentLength + 1 + wordLength <= M) {
                // Add the word with a space
                currentLength += 1 + wordLength;
            } else {
                // Move to the next line
                currentLine++;
                if (currentLine > N) {
                    break;
                }
                currentLength = wordLength;
            }

            totalWords++;
        }

        // Print the total number of words that can be accommodated
        System.out.println(totalWords);
    }
}
