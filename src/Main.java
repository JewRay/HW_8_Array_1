import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Задача 1

        System.out.println("Задача 1");

        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }


        double[] array2 = {1.57, 7.654, 9.986};

        Random random = new Random();
        int[] array3 = random.ints(3, 3, 100000).toArray();

        //Задача 2

        System.out.println("Задача 2");

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array2[i]);
                break;
            }
            System.out.print(array2[i] + ", ");
        }

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array3[i]);
                break;
            }
            System.out.print(array3[i] + ", ");
        }
        
        /*
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        */

        //Задача 3

        System.out.println("Задача 3");

        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }

        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array2[i]);
                break;
            }
            System.out.print(array2[i] + ", ");
        }

        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array3[i]);
                break;
            }
            System.out.print(array3[i] + ", ");
        }

        //Задача 4

        System.out.println("Задача 4");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                array[i]++;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}