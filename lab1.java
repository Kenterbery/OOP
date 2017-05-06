/**
 * Created by kenterbery on 16.02.17.
 */
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("n: ");
       short n = sc.nextShort();
       System.out.println("m: ");
       short m = sc.nextShort();
       System.out.println("a: ");
       short a = sc.nextShort();
       System.out.println("b: ");
       short b = sc.nextShort();
	//comment
       double result = 0;

       try {
           if (n-a <= 0) {
               throw new IndexOutOfBoundsException("Недопустимый диапазон a-n");
           }
           if (m-b <= 0) {
               throw new IndexOutOfBoundsException("Недопустимый диапазон b-m");
           }

           for (short i = a; i <= n; i++) {
               if (i-1 == 0) {
                   throw new ArithmeticException("Деление на ноль");
               }
               for (short j = b; j <= m; j++){
                   if (j == 0) {
                       throw new ArithmeticException("Деление на ноль");
                   }
                   result += ( (double) i/j/(i-1));
               }
           }
           System.out.println(result);

       } catch (ArithmeticException e) {
           System.out.println("Недопустимая арифметическая операция.");
       } catch (IndexOutOfBoundsException e) {
           System.out.println("Индекс вне пределов.");
       }

    }
}
