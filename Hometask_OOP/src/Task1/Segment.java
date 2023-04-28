package Task1;

public class Segment {
    private int XPointA;
    private int YPointA;
    private int XPointB;
    private int YPointB;

    public Segment(int XPointA, int YPointA, int XPointB, int YPointB) {
        this.XPointA = XPointA;
        this.YPointA = YPointA;
        this.XPointB = XPointB;
        this.YPointB = YPointB;
    }

    //Проверить допустимость значений?
    public double segmentLenght() {
        return Math.sqrt((XPointB - XPointA) * (XPointB - XPointA) + (YPointB - YPointA) * (YPointB - YPointA));
    }

    public boolean equals(Segment segment) {
        double lenghtOfCurrentSegment = segmentLenght();
        double lenghtOfAnotherSegment = segment.segmentLenght();
        return lenghtOfCurrentSegment == lenghtOfAnotherSegment;
    }
}
