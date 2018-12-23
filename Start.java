import dao.kongzhi;

public class Start {
//学长的控制窗口

    public static void main(String[] args) {


        kongzhi ch = new kongzhi();

        while (true) {
            ch.menu();
            int choose = ch.getInputInt("<请输入数字选择操作>");
            ch.Choose(choose);
        }

    }
}