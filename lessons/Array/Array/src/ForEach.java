public class ForEach {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "привет";
        strings[1] = "язык программирования";
        strings[2] = "джава";

        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println();

        int[] numbers = {1, 2, 3};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
