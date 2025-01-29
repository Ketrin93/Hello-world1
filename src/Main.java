import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] numbers = {1, 2, 3};
        System.out.print(Arrays.toString(numbers));

        double[] numbers1 = {1.57, 7.654, 9.986};
        System.out.print(Arrays.toString(numbers1));

        int[] weights = {58, 61, 65};
        System.out.print(Arrays.toString(weights));

        System.out.println();

        System.out.println(" Задание 2");

        int[] classArr = {1, 2, 3};
        {
            System.out.println(Arrays.toString(classArr));
        }
        double[] numbers1Array1 = {1.57, 7.564, 9.986};
        {
            System.out.print(Arrays.toString(numbers1Array1));
        }
        int[] weightsArray2 = {58, 61, 65};
        {
            System.out.print(Arrays.toString(weightsArray2));

        }

        System.out.println("Задание 3");
        int[] runArr = {1, 2, 3};
        for (int i = runArr.length - 1; i >= 0; i--) {
            System.out.print(runArr[i]);
            if (i > 0) {
                System.out.print(",");
            }
              }
        System.out.println();
            double[] startArr = {1.57, 7.654, 9.986};
            for (int i1 = startArr.length - 1; i1 >= 0; i1--) {
                System.out.print(startArr[i1]);
                if (i1 > 0) {
                    System.out.print(",");
                }
                   }
            System.out.println();
                int[] blackArr = {58, 61, 65};
                for (int i2 = blackArr.length - 1; i2 >= 0; i2--) {
                    System.out.print(blackArr[i2]);
                    if (i2 >0) {
                        System.out.print(",");}
                    }
                System.out.println();
                    System.out.print("");
                    System.out.println("Task4");

                    int[] whiteArr = {1, 2, 3};
                    for (int i3 = 0; i3 < whiteArr.length; i3++) {
                        if (whiteArr[i3] % 2 != 0) {
                            whiteArr[i3] = whiteArr[i3] + 1;
                            System.out.print(whiteArr[i3] + " ");
                        }

                    }
                }
            }





















































