public class pattern21 {
    public static void main(String[] args) {
        int n = 4;              // Maximum number
        int size = 2 * n - 1;   // Matrix size

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print((n - min) + " ");
            }
            System.out.println();
        }
    }
}