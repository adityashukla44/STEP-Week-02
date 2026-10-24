public class WordReversalEncoder {
    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ", -1);
        StringBuilder result = new StringBuilder();
        for (int wordIndex = 0; wordIndex < words.length; wordIndex++) {
            StringBuilder reversedWord = new StringBuilder();
            String word = words[wordIndex];
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }
            if (wordIndex > 0) {
                result.append(' ');
            }
            result.append(reversedWord);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord("hello club"));
    }
}
