import dao.Buy;

public class Stage {
    //学员的购买窗口
    public static void main(String[] args) {


        Buy ch = new Buy();

        while (true) {
            ch.menu();
            int choose = ch.getInputInt("<请输入数字选择操作>");
            ch.Choose(choose);
        }

    }
}
