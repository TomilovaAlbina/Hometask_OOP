package ValueCloseToNumberFromArray;

public class main {
    public static void main(String[] args) {
        final int NUMBER = 10;
        int[] array = {5, 15, 30, 2, 9, 11};
        System.out.println("Число, ближайшее к 10: " + search(NUMBER, array));
    }

    public static int search(int x, int[] array) {
        int min = Math.abs(array[0] - x);
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            int delta = Math.abs(array[i] - x);
            if (delta < min) {
                min = delta;
                index = i;
            }
            if (delta == min && array[i] > array[index]) {
                index = i;
            }
        }
        return array[index];
    }
}

