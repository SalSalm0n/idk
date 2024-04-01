public class Massive {
    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 4, 5, 5, 6, 10, 12, 13, 15, 22, 33, 35, 37, 40, 56, 88, 90};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 10) {
                System.out.println(arr[i]);
            }



            for (int a = 0; a < arr.length; a++) {
                if (arr[a] > 5 && arr[a] < 9) {
                    System.out.println(arr[a]);
                }
            }


            for (int b = 0; b < arr.length; b++) {
                if (arr[b] % 2 == 0) {
                    System.out.println(arr[b]);
                }
            }

        }

    }
}