package com.duanhuiran;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
            System.out.println("Hello World ( " + i +" times)" );

        for (int i = 5; i >= 0;i--)
            System.out.println("Hello World ( " + i + " times)");

        int j = 0;
        while (j <= 5){
            System.out.println("While loop" + j);
            j++;
        }

//如何匹配关键词来停止程序运行？
//        判断文本相等，不能用==，只能用 x.equals("y")
//        Scanner 类最好写在while循环外，这样能够优化程序（不用多次编写System.in）
//        用toLowerCase来匹配大小写
//        while循环开始之前，需要把匹配条件定义在外面，可以设定一个空值

        Scanner input = new Scanner(System.in);
        String result = "";
        while (!result.equals("quit")){
            System.out.print("Input:");
            result = input.next().toLowerCase();
//            continue: 让用户输入pass后，不打印值出来，然后跳到while循环的开头
            if (result.equals("pass"))
                continue;
//            break:让用户输入quit后，不打印值出来，用 break 直接停止 while loop
            if (result.equals("quit"))
                break;
            System.out.println(result);
        }
// 如果while循环里面有break，我们可以直接写 while(true),来让他一直循环。
        while (true){
            System.out.print("Input:");
            result = input.next().toLowerCase();
//            continue: 让用户输入pass后，不打印值出来，然后跳到while循环的开头
            if (result.equals("pass"))
                continue;
//            break:让用户输入quit后，不打印值出来，用 break 直接停止 while loop
            if (result.equals("quit"))
                break;
            System.out.println(result);
        }


// do while loop 至少执行一次，就算不满足条件，也要执行一次。
        do {
            System.out.print("Input:");
            result = input.next().toLowerCase();
            System.out.println(result);
        } while (!result.equals("quit"));

//For-Each loop
        String[] fruits = {"Apple","Mongo","Banana"};
        for (String fruit : fruits)
            System.out.println(fruit);



    }
}
