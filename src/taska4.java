import java.util.Scanner;

public class taska4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the text input from the user
        System.out.print("Enter the text: ");
        String text = input.nextLine();

        // Split the text into individual words
        String[] words = text.split("[\\s\\p{Punct}]+");

        // Initialize variables for the modified text and removed words
        String modifiedText = "";
        String removedWords = "";

        // Loop through each word and check for double letters
        for (String word : words) {
            boolean hasDoubleLetters = false;
            for (int i = 0; i < word.length() - 1; i++) {
                if (word.charAt(i) == word.charAt(i + 1)) {
                    hasDoubleLetters = true;
                    break;
                }
            }
            // If the word has double letters, add it to the removed words string
            // Otherwise, add it to the modified text string
            if (hasDoubleLetters) {
                removedWords += word + " ";
            } else {
                modifiedText += word + " ";
            }
        }

        // Print the removed words and modified text
        System.out.println("Removed words: " + removedWords);
        System.out.println("Modified text: " + modifiedText);
    }
}
