public class McqBasedQuestions {
    public static void main(String[] args) {
        // If no arguments are provided
        if (args.length == 0) {
            System.out.println("No arguments provided!");
            return;
        }

        // StringBuilder is efficient for concatenation
        StringBuilder result = new StringBuilder();

        // Append each argument with a space
        for (int i = 0; i < args.length; i++) {
            result.append(args[i]);
            if (i < args.length - 1) {
                result.append(" "); // Add space between words
            }
        }

        System.out.println("Concatenated String: " + result.toString());
    }
}
