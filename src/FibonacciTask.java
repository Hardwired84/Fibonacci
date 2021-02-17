import java.util.Random;
import java.util.Scanner;

/**
 * @author - Oleksandr Fedoruk on 17.02.2021.
 * @project Fibonacci
 */
public class FibonacciTask {

    public static void main(String[] args) {
        Scanner inputFromConsole = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = inputFromConsole.nextInt();

        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < n; ++i) {
            array[i] = array[i - 1] + array[i - 2];
        }
        for (int i = 0; i < n; ++i) {
            //System.out.println(array[i]);
        }
        Random random = new Random();
        int numberX = random.nextInt(n);
        int numberY = random.nextInt(n);
        System.out.println("Сгенерированое случайное число X в приделах N: " + numberX);
        System.out.println("Сгенерированое случайное число Y в приделах N: " + numberY);
        System.out.println("Сумма всех чисел из сохраненного массива имеющие индекс от X до Y: " + (numberX + numberY));

    }
}
