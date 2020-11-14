package TOOLS;

import java.util.Scanner;

public class Main extends Tools {
    public static void main(String[] args) {
        Tools tools = new Tools();
        System.out.println("请输入你想进行的操作：");
        System.out.println("1.求某数的阶乘");
        System.out.println("2.求斐波那契数列第n项");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                tools.jiecheng();
                break;
            case 2:
                tools.feibonaqi();
                break;

        }
    }
}
