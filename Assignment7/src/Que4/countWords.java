package Que4;
public class countWords {
    public static void main(String[] args) {
        String str = "Hello, World! This is a test string.";
        System.out.println("Number of words in the string: " + countWord(str));
    }

    public static int countWord(String str) {
        // Remove leading and trailing spaces
        str = str.trim();

        // Check if the string is empty or contains just one word
        if (str.isEmpty() || str.indexOf(' ') == -1) {
            return 1;
        }

        // Split the string into words using space as the delimiter
        String[] words = str.split(" ");

        // Return the number of words
        return words.length;
    }
}