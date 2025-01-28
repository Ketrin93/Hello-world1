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
        for (int i = 0; i < classArr.length; i++) {
            System.out.print(classArr[i]);
            System.out.print(",");
        }
        double[] numbers1Array1 = {1.57, 7.564, 9.986};
        for (int c = 0; c < numbers1Array1.length; c++) {
            System.out.print(numbers1Array1[c]);
            System.out.print(",");
        }
        int[] weightsArray2 = {58, 61, 65};
        for (int r = 0; r < weightsArray2.length; r++) {
            System.out.print(weightsArray2[r]);
            System.out.print(",");
        }

        System.out.println("Задание 3");
        int[] runArr = {1, 2, 3};
        for (int e = runArr.length - 1; e >= 0; e--) {
            System.out.print(runArr[e]);
                System.out.print(",");
            }
            double[] startArr = {1.57, 7.654, 9.986};
            for (int o = startArr.length - 1; o >= 0; o--) {
                System.out.print(startArr[o]);
                    System.out.print(",");
                }
                int[] blackArr = {58, 61, 65};
                for (int ca = blackArr.length - 1; ca >= 0; ca--) {
                    System.out.print(blackArr[ca]);
                        System.out.print(",");
                    }
                    System.out.print("");
                    System.out.println("Task4");

                    int[] whiteArr = {1, 2, 3};
                    for (int g = 0; g < whiteArr.length; g++) {
                        if (whiteArr[g] % 2 != 0) {
                            whiteArr[g] += 1;
                            if (g < whiteArr.length - 1)
                                System.out.print(whiteArr[g] + " ");
                        } else
                            System.out.print(whiteArr[g]);
                    }
                }
            }

















































