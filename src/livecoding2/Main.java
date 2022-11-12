package livecoding2;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculateWordCount("Word word word word word."));
    }

    public static int calculateWordCount(String string) {
        if (string == null || string.isBlank()) {
            return 0;
        }
        int wordCount = 1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                wordCount++;
            }
        }
        return wordCount;
    }
}