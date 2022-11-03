package src.shopping;

public class Goods {
    private String name;//商品名
    private double money;//商品单价
    private int cnt;//购买数量

    public Goods(String name, double money, int cnt) {
        this.name = name;
        this.money = money;
        this.cnt = cnt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public double pay() {
        return cnt*money;
    }
}
