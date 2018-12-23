package util;

import been.Sp;
import been.Stu;


import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Handle {

    public static ArrayList list = new ArrayList();
    public static ArrayList list2 = new ArrayList();
    public static boolean AddTel(Stu add_tel) {
        boolean add = false;
        add = list.add(add_tel);
        return add;
    }
    public static boolean AddSp(Sp add_tel) {
        boolean add = false;
        add = list2.add(add_tel);
        return add;
    }

    public static boolean updateTelByName(String name, Stu update_telByName) {
        boolean update=false;
        for(Object obj:list){
            Stu stu=(Stu) obj;
            if(name.equals(stu.getName())){
                list.set(list.indexOf(stu), update_telByName);
                update=true;
                break;
            }
        }
        return update;
    }
    public static boolean deleteTelByName(String delete_name) {
        boolean delete=false;
        for(Object obj:list){
            Stu stu=(Stu)obj;
            if(delete_name.equals(stu.getName())){
                    delete=list.remove(stu);
                break;
            }
        }
        return delete;
    }






    public static boolean selectName(String name) {
        boolean fag = false;
        for (Object obj : list) {
            Stu tel = (Stu) obj;
            if (name.equals(tel.getName())) {
                fag = true;
                break;
            }
        }
        return fag;
    }


    public static boolean selectNumber(String number) {
        boolean fag = false;
        for (Object obj : list) {
            Stu tel = (Stu) obj;
            if (number.equals(tel.getJf())) {
                fag = true;
                break;
            }
        }
        return fag;
    }


    }











