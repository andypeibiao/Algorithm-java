/**
 * Created by Administrator on 2017/7/18 0018.
 */

//实用工具类库java.util包,提供了一些实用的方法和数据结构

import java.util.Scanner;

public class num2Voice {
    private static Scanner sc;
    private static String input;
    private static String units[] = {"", "十", "百", "千", "万", "十", "百", "千", "亿"};
    private static String nums[] = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九", "十"};
    private static String result[];

    public static void main(String[] args) {
        System.out.println("请输入一串数字：如123456，最多9位");
        sc = new Scanner(System.in);
        input = sc.nextLine();
        num2Voice(Integer.parseInt(input));
    }

    public static void num2Voice(int num) {
        String out = "";
        String numString = String.valueOf(num);
        System.out.println("输入的数字是：" + numString);
        result = new String[numString.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = String.valueOf(numString.charAt(i));
        }
        int back = 0;
        for (int i = 0; i < result.length; i++) {
            if (!result[i].equals("0")) {
                back = result.length - i - 1;
                out += nums[Integer.parseInt(result[i])];
                out += units[back];
            } else {
                if (i == result.length - 1) {
                } else {
                    if (!result[i + 1].equals("0")) {
                        out += nums[0];
                    }
                }
            }
        }
        System.out.println(out);
    }
}
