/**
 * Created by kenterbery on 27.02.17.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class lab2 {

    public static void output(byte[][] arr) {
        for (int i = 0; i < arr.length; i++, System.out.println()) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {

        Random rnd = new Random();

        Scanner sc = new Scanner(System.in);
        System.out.println("Количество строк: ");
        int n = 0;
        int m = 0;
        try {
            n = sc.nextInt();
            if (n < 0) {
                throw new IndexOutOfBoundsException("Недопустимое количество строк матрицы");
            }
            System.out.println("Количество столбцов: ");
            m = sc.nextInt();
            if (m < 0) {
                throw new IndexOutOfBoundsException("Недопустимое количество столбцов матрицы");
            }
        } catch (InputMismatchException e) {
            System.out.println("Неверный тип переменной");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Отрицательное количество строк/столбцов матрицы");
            n = 0;
            m = 0;
        }
        /*
        Заполняем матрицу псевдослучайными числами
        */

        byte[][] matrixA = new byte[n][m];
        for (int i = 0; i < matrixA.length; i++) {
            rnd.nextBytes(matrixA[i]);
        }

        System.out.println("Матрицa А: "); //Выводим матрицу А
        output(matrixA);

        //Транспонируем матрицу
        byte[][] matrixB = new byte[m][n];
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                matrixB[i][j] = matrixA[j][i];
            }
        }

        System.out.println("Матрицa B: "); // Выводим матрицу В
        output(matrixB);

        // Среднее значение каждого столбцa
        System.out.println("Среднее значение столбцов: ");
        for (int i = 0; i < n; i++) {
            double med = 0;
            for (int j = 0; j < m; j++) {
                 med += matrixB[j][i];
            }
            System.out.println(med/matrixB.length);
        }
    }
}