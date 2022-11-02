package src.abstractClass;

/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome extends Income{

	// TODO

    public RoyaltyIncome(int salary) {
        super(salary);
    }

    @Override
    public double getTax() {
        return this.salary*0.2;
    }
}
