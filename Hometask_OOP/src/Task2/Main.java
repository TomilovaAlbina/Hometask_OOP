package Task2;

public class Main {

    public static void main(String[] args) {

        String text = ":(";
        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(new String[]{"спам", "спам2", "спам3"});
        NegativeTextAnalyzer negativeTextAnalyzer = new NegativeTextAnalyzer();
        TooLongTextAnalyzer tooLongTextAnalyzer = new TooLongTextAnalyzer(10);
        TextAnalyzer[] textAnalyzer = new TextAnalyzer[]{spamAnalyzer, negativeTextAnalyzer, tooLongTextAnalyzer};
        Label resultToConsole = returnLabel(textAnalyzer, text);
        System.out.println(resultToConsole);
    }

    private static Label returnLabel(TextAnalyzer[] array, String text) {

        for (int i = 0; i < array.length; i++) {
            Label result = array[i].processText(text);
            if (result != Label.OK) {
                return result;
            }
        }
        return Label.OK;
    }
}
