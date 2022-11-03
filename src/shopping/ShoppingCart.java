package src.shopping;

import java.util.Scanner;

public class ShoppingCart {
    private Goods[] goods=new Goods[100];
    private int count;
    private Scanner in=new Scanner(System.in);
    public void add() {
        String name;
        double money;
        int cnt;
        System.out.println("请输入商品名：");
        name=in.next();
        System.out.println("请输入商品单价：");
        money=in.nextDouble();
        System.out.println("请输入购买数量：");
        cnt=in.nextInt();
        goods[count]=new Goods(name,money,cnt);
        count++;
    }

    public void delete() {
        String name;
        int cnt;
        System.out.println("请输入商品名：");
        name=in.next();
        System.out.println("请输入删除数量数量：");
        cnt=in.nextInt();
        for(int i=0;i<count;i++){
            Goods g=goods[i];
            if(name.equals(g.getName())){
               g.setCnt(g.getCnt()-cnt);
                System.out.println("该商品还剩下："+g.getCnt());
            }
        }
    }

    public void query() {
        System.out.println("你购买了以下商品：");
        double total=0;
        for(int i=0;i<count;i++){
            Goods g=goods[i];
            if(g.getCnt()>0){
                System.out.println(g.getName()+" "+g.getMoney()+" "+g.getCnt());
                total+=g.pay();
            }
        }
        System.out.println("需要支付："+total+"元");
    }


}
