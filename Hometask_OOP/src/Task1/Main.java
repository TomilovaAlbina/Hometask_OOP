package Task1;

public class Main {
    public static void main(String[] args) {
        Segment segment1 = new Segment(1, 1, 2, 2);
        Segment segment2 = new Segment(-3, 0, 1, 1);

        if (segment1.equals(segment2)) {
            System.out.println("Длина отрезков равна");
        } else {
            System.out.println("Длина отрезков разная");
        }
    }
}
