import java.util.Arrays;
//дз#1
public class Main {
        public static void main(String[] args) {
            double[] masiv1= {16.0, 3.5, -2.5, 7.0, -4.5, -9.5, 10.0, -5.5, 4.0, -1.5, 9.0, -3.5, 7.5, 8.5, 2.0};
            System.out.println(Arrays.toString(masiv1));
            double average = 0.0;
            int count = 0;
            for (int i = 0; i < masiv1.length; i++) {
                if (masiv1[i] < 0) {
                    for (int j = i + 1; j < masiv1.length; j++) {
                        if (masiv1[j] > 0) {
                            average = average + masiv1[j];
                            count++;
                        }
                    }
                    break;
                }
            }
            System.out.println(average);
            System.out.println(count);
            System.out.println(average / count);
        }
    }

