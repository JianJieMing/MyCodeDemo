package three;

import java.util.Random;
import java.util.Scanner;

/**
 * @Classname three.Main30
 * @Date 2019/7/24 11:36
 * @Created by jianjieming
 */
public class Main30 {
    public static void main(String[] args) {

        int a = 22, b = 33;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + "    " + b);

        /*
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            int x = i >> 1 << 1;
            if (i == 33) {
                System.out.println("程序退出!");
                break;
            } else if (x == i) {
                System.out.println(i + " 是偶数");
            } else {
                System.out.println(i + " 是奇数");
            }
        }
         */
    }
}
