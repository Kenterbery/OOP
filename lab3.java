/**
 * Created by kenterbery on 28.02.17.
 */
import java.util.Scanner;
import java.util.regex.*;

public class lab3 {
    private static boolean searcher(CharSequence arr) {
        Pattern p = Pattern.compile("[бБвВгГдДжЖзЗкКлЛмМнНпПрРсСтТфФхХцЦчЧшШщЩьЬъЪ]");
        Matcher m = p.matcher(arr);
        return m.lookingAt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        StringBuffer sb = new StringBuffer(sc.nextLine());
        System.out.println("Введите длинну слова: ");
        short len = sc.nextShort();
        String Str = sb.toString();
        sb.delete(0, sb.length());
        for (String retval : Str.split(" ")) {
            if (retval.length() == len && searcher(retval)) {
                continue;
            } else {
                sb.append(retval + " ");
            }
        }
        System.out.println(sb);

    }
}
