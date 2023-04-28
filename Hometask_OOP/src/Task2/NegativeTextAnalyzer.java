package Task2;

public class NegativeTextAnalyzer extends AbstractKeywordAnalyzer {

    @Override
    public String[] getKeywords() {
        String[] arrayOfNegativeKeywords = new String[]{":(", "=(", ":|"};
        return arrayOfNegativeKeywords;
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
