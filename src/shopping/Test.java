package src.shopping;
//购物车案例
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ShoppingCart shoppingCart=new ShoppingCart();
        while (true) {
            System.out.println("请选择以下功能：");
            System.out.println("1：往购物车中添加商品");
            System.out.println("2：移除购物车中的商品");
            System.out.println("3：查询购物车中的商品");
            System.out.println("4：退出系统");
            Scanner in=new Scanner(System.in);
            int op=in.nextInt();
            switch (op){
                case 1:
                    shoppingCart.add();
                    break;
                case 2:
                    shoppingCart.delete();
                    break;
                case 3:
                    shoppingCart.query();
                    break;
                case 4:
                    return;

            }
        }

    }
}
