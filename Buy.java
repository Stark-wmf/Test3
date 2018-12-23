package dao;

import been.Sp;
import been.Stu;

import java.util.Scanner;

public class Buy {
    Stu stu = new Stu();

    public int getInputInt(String tel){
        int input_int=0;
        try{
            System.out.println(tel);
            Scanner s=new Scanner(System.in);
            input_int=s.nextInt();
        }catch (Exception e) {
            System.out.println("输入错误！！请重新输入。");
            input_int=getInputInt(tel);
        }
        return input_int;

    }



    public String getInputString(String string) {
        String input_String = "";
        try {
            System.out.println(string);
            Scanner s = new Scanner(System.in);
            input_String = s.next();
        } catch (Exception e) {
            System.out.println("输入错误！");
            input_String = getInputString(string);
        }
        return input_String;   }

    public void menu() {
        System.out.println("************************");
        System.out.println("学员窗口");
        System.out.println("1.买买买");
        System.out.println("2.查看积分");
        System.out.println("3.退出");
        System.out.println("************************");
    }

    public void Choose(int coad) {
        switch (coad) {
            case 1:
                System.out.println("<---你已进入购买商品界面--->");

                Sp add_tel =Buy();

                    if (stu.getJf()<add_tel.getJf()) {
                        System.out.println("\n购买成功！！\n");
                    } else {
                        System.out.println("\n购买失败！！积分不足\n");
                    }

                break;
            case 2:
                System.out.println(stu.getJf());
                break;
            case 3:
                System.out.println("退出成功！");
                System.exit(0);
                break;
            default:
                System.out.println("没有该选项！！请重新输入！");
                break;
        }
    }

    private Sp Buy() {
Sp sp =new Sp("hc",5);
return  sp;

    }
}
