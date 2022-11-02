package src.abstractClass;

public class SalaryIncome extends Income{

	// TODO


    public SalaryIncome(int salary) {
        super(salary);
    }

    @Override
    public double getTax() {
        return 0.3*(this.salary-5000);
    }
}
