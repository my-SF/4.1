package TOOLS;

import java.util.Scanner;

public class Tools {
    public void jiecheng(){
        System.out.println("请输入需要求阶乘的数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(jie(a));
    }

    public void feibonaqi(){
        System.out.println("请输入要求的斐波那契数列项数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fei(a));
    }

    public double jie(int a) {
        double p = 1;
        for (int i = 1; i <= a; i++) {
            p *= i;
        }
        return p;
    }

    public int fei(int a) {
        if (a == 0) {
            return 0;
        }
        if (a == 1) {
            return 1;
        }
        return fei(a - 1) + fei(a - 2);
    }
}
