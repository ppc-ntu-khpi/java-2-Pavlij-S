//package domain;

public class Exercise {
    // Зашифровать фразу шифром Цезаря
    public static String Calculate(String phrase, int shift) {
        if (phrase == null) {
            return null;
        }

        int normalizedShift = shift % 26;
        if (normalizedShift < 0) {
            normalizedShift += 26;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                char encrypted = (char) ('A' + (c - 'A' + normalizedShift) % 26);
                result.append(encrypted);
            } else if (c >= 'a' && c <= 'z') {
                char encrypted = (char) ('a' + (c - 'a' + normalizedShift) % 26);
                result.append(encrypted);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}