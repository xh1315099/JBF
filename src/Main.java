import java.util.Scanner;

/**
 * {@code @author:Xu}
 * {@code @createTime:2024/02/05 15:10}
 * {@code @description:京北方面试}
 */

public class Main {
    public static void main(String[] args) {
        Shop customer = new Shop();
        Scanner scanner = new Scanner(System.in);
        int appleSum = scanner.nextInt();
        int strawberrySum = scanner.nextInt();
        int mangoSum = scanner.nextInt();
        System.out.println(customer.totalPrice1(appleSum, strawberrySum));
        System.out.println(customer.totalPrice2(appleSum, strawberrySum, mangoSum));
        System.out.println(customer.totalPrice3(appleSum, strawberrySum, mangoSum));
        System.out.println(customer.totalPrice4(appleSum, strawberrySum, mangoSum));
    }
}