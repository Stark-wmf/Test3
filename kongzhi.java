package dao;

import been.Stu;
import util.Handle;

import java.util.Scanner;

public class kongzhi {
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
            System.out.println("输入错误！！电话簿失去了他的梦想！orz");
            input_String = getInputString(string);
        }
        return input_String;   }

    public void menu() {
        System.out.println("************************");
        System.out.println("学长窗口");
        System.out.println("1.添加学生信息");
        System.out.println("2.修改学生信息（根据姓名修改）");
        System.out.println("3.删除学生信息(根据姓名删除)");
        System.out.println("4.退出");
        System.out.println("************************");
    }

    public void Choose(int coad) {
        switch (coad) {
                case 1:
                System.out.println("<---你已进入添加学生信息界面--->");

                  Stu add_tel =getoneTel();

                      if (Handle.AddTel(add_tel)) {
                        System.out.println("\n添加成功！！\n");
                     } else {
                        System.out.println("\n添加失败！！\n");
                    }

                break;
                case 2:
                String update_name=getInputString("请输入姓名");
                if(Handle.selectName(update_name)){
                    System.out.println("<---请输入新的学生信息--->");
                    Stu update_telByName=getoneTel();
                    if(!(update_name.equals(update_telByName.getName()))){
                        if(Handle.updateTelByName(update_name,update_telByName)){
                            System.out.println("\n修改成功！！\n");
                        }else{
                            System.out.println("\n修改失败！！\n");
                        }
                    }else{
                        System.out.println("该姓名的学生信息已存在！！！	请重新添加！！");
                    }
                }else{
                    System.out.println("\n没有该姓名的学生信息！！请重新选择！\n");
                }
                break;
                case 3:
                System.out.println("<---你已进入删除联系人信息(根据姓名删除)界面--->");
                String delete_name=getInputString("请输入姓名");

                if(Handle.selectName(delete_name)){
                    if(Handle.deleteTelByName(delete_name)){
                        System.out.println("\n删除成功！！！\n");
                    }else{
                        System.out.println("\n删除失败！！！\n");
                    }
                }else{
                    System.out.println("\n没有该学生的信息！！请重新选择！\n");
                }
                break;

                case 4:
                System.out.println("退出成功！");
                System.exit(0);
                break;
                default:
                System.out.println("没有该选项！！请重新输入！");
                break;
    }
    }

    private Stu getoneTel() {
        Stu tel = new Stu();
        tel.setJf(getInputInt("请输入积分"));
        tel.setName(getInputString("请输入姓名"));

        return tel;

    }
}