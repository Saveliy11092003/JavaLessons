public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        int[] array1 = {1, 2, 3};
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}