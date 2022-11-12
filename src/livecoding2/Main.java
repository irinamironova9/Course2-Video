package livecoding2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "Собака, ко*шка& #собака дом! -сад- ДОМ кошка: дом; птица, кошка.";
        HashMap<String, Integer> eachWordCount = calculateEachWordCount(s);
        for (Map.Entry entry : eachWordCount.entrySet()) {
            System.out.println(entry);
        }
    }

    public static HashMap<String, Integer> calculateEachWordCount(String string) {
        if (string == null || string.isBlank()) {
            throw new IllegalArgumentException("Строка пустая!");
        }
        StringBuilder sb = new StringBuilder(string.toLowerCase());
        for (int i = 0; i < sb.length(); i++) {
            if ((sb.charAt(i) >= 33 && sb.charAt(i) <= 64) ||
                    (sb.charAt(i) >= 91 && sb.charAt(i) <= 96) ||
                    (sb.charAt(i) >= 123 && sb.charAt(i) <= 126)) {
                sb.deleteCharAt(i);
            }
        }
        String[] words = sb.toString().split(" ");
        HashMap<String, Integer> eachWordCount = new HashMap<>();
        for (String word : words) {
            if (!eachWordCount.containsKey(word)) {
                eachWordCount.put(word, 1);
            } else {
                eachWordCount.replace(word, eachWordCount.get(word) + 1);
            }
        }
        return eachWordCount;
    }
}