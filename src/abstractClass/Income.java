package src.abstractClass;

/**
 * 定义抽象类Income
 */
public abstract class Income {

	// TODO
    int salary;

    public Income(int salary) {
        this.salary = salary;
    }
    public abstract double getTax();


}
