public class Main {

    public static void main(String[] args) {
        String[] sentences = {
                "italem irad irigayaj",
                "iadab itsap ulalreb",
                "nalub kusutret gnalali"
        };

        for (String sentence : sentences) {
            System.out.println(reverseWordsInSentence(sentence));
        }
    }

    public static String reverseWordsInSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            reversedSentence.append(reverseWord(word)).append(" ");
        }

        return reversedSentence.toString().trim();
    }

    public static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}