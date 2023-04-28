package Task2;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private final int length;

    public TooLongTextAnalyzer(int length) {
        this.length = length;
    }

    @Override
    public Label processText(String text) {
        if (length < text.length()) {
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
}
