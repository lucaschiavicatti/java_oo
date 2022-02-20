package entities;

public class PessoaFisica extends Contribuinte{

    private Double healthExpenditures;

    public PessoaFisica(String name, Double income) {
        super(name, income);
    }

    public PessoaFisica(String name, Double income, double healthExpenditures) {
        super(name, income);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double impost() {
        if (getIncome() < 20000) {
            return getIncome() * 0.15 - healthExpenditures * 0.5;
        }
        else {
            return getIncome() * 0.25 - healthExpenditures * 0.5;
        }
    }

}
