import java.util.Arrays;

//дз#1
public class Main {
    public static void main(String[] args) {
        double[] arr = {16.0, 3.5, -2.5, 7.0, -4.5, -9.5, 10.0, -5.5, 4.0, -1.5, 9.0, -3.5, 7.5, 8.5, 2.0};
        System.out.println(Arrays.toString(arr));
        double sum = 0.0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > 0) {
                        sum += arr[j];
                        count++;
                    }
                }
                break;
            }
        }
        System.out.println("Average = " + sum / count);
        System.out.println("--------------------------------------------");
//        16.0, 3.5, -2.5, 7.0, -4.5, -9.5, 10.0, -5.5, 4.0, -1.5, 9.0, -3.5, 7.5, 8.5, 2.0
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            double a = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = a;
            System.out.println(Arrays.toString(arr));
        }
    }
}



