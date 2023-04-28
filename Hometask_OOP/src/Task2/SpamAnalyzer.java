package Task2;

public class SpamAnalyzer extends AbstractKeywordAnalyzer {
    private String[] arrayOfSpamKeywords;

    public SpamAnalyzer(String[] arrayOfSpamKeywords) {
        this.arrayOfSpamKeywords = arrayOfSpamKeywords;
    }

    @Override
    public String[] getKeywords() {
        return arrayOfSpamKeywords;
    }

    @Override
    public Label getLabel() {
        return Label.SPAM;
    }
}
