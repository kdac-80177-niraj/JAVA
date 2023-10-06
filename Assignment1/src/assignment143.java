public class assignment143 {
    public static void main(String[] args) {
        int rows = 6; // Adjust the number of rows as needed
        printPattern(rows);
    }

    public static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
