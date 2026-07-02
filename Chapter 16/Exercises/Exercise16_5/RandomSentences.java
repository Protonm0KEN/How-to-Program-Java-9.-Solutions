package Exercise16_5;

import java.util.Random;

public class RandomSentences {
    public static void main( String[] args ) {
        Random randomObj = new Random();

        String[] articles = {
                "the",
                "a",
                "one",
                "some",
                "any",
        };
        String[] nouns = {
                "boy",
                "girl",
                "dog",
                "town",
                "car"
        };
        String[] verbs = {
                "drove",
                "jumped",
                "ran",
                "walked",
                "skipped",
        };
        String[] prepositions = {
                "to",
                "from",
                "over",
                "under",
                "on"
        };

        String[] sentences = new String[20];

        for( int i = 0; i < 20; i++ ){
            StringBuilder sentence = new StringBuilder();
            sentence.append(articles[randomObj.nextInt(articles.length)]).append(" ");
            sentence.append(nouns[randomObj.nextInt(nouns.length)]).append(" ");
            sentence.append(verbs[randomObj.nextInt(verbs.length)]).append(" ");
            sentence.append(prepositions[randomObj.nextInt(prepositions.length)]).append(" ");
            sentence.append(articles[randomObj.nextInt(articles.length)]).append(" ");
            sentence.append(nouns[randomObj.nextInt(nouns.length)]);
            sentence.setCharAt(0, Character.toUpperCase(sentence.charAt(0)));
            sentence.append(".");
            sentences[i] = sentence.toString();
        }

        for( String sentence : sentences ){
            System.out.println(sentence);
        }
    }
}
