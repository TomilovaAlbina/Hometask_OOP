package Task2;

public abstract class AbstractKeywordAnalyzer implements TextAnalyzer {
    public abstract String[] getKeywords();

    public abstract Label getLabel();


    public Label processText(String text) {
        String[] arrayOfKeywords = getKeywords();
        Label label = getLabel();
        for (String arg : arrayOfKeywords) {
            boolean result = text.contains(arg);
            if (result == true) {
                return label;
            }
        }
        return Label.OK;
    }
}
