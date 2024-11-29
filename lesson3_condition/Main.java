package lesson3_condition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Mời b nhập số tiền muốn quy đổi: ");
        double money= Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhập loại tiền muốn quy đổi ra VNĐ");
        String type = scanner.nextLine();*/
        /*switch (type){
            case "USD":
                System.out.println("Số tiền sau khi quy đổi = "+(money*24000) +" VNĐ");
                break;
            case "EUR":
                System.out.println("Số tiền sau khi quy đổi = "+(money*28000) +" VNĐ");
                break;
            case "VND":
                System.out.println("Số tiền sau khi quy đổi = "+(money) +" VNĐ");
                break;
            default:
                System.out.println("Không hợp lệ");

        }*/

        // n =10
        /*System.out.println("Mời b nhập vào một số nguyên: ");
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 1;
        int mul=1;

        for (int i = 2; i <= n; i++) {
            sum+=i; // sum = sum +i -> 1 + 2 + 3 + 4
        }
        System.out.println(sum);

        for (int i = 2; i <= n; i++) {
            mul*=i; // sum = sum +i -> 1 + 2 + 3 + 4
        }*/

        int sum = 0;
        String choose ="";
        do {
            System.out.println("Mời b nhập vào số nguyên: ");
            int n = Integer.parseInt(scanner.nextLine());
            sum+=n;
            System.out.println("DO u want to continue?(Y/N)");
            choose = scanner.nextLine();
        } while (choose.equalsIgnoreCase("y"));
        System.out.println("Tổng là: "+sum);
    }
}
