package entities;

public class PessoaJuridica extends Contribuinte{

    private Integer employees;

    public PessoaJuridica(String name, Double income) {
        super(name, income);
    }

    public PessoaJuridica(String name, Double income, Integer employees) {
        super(name, income);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @Override
    public double impost() {
        if (employees > 10) {
            return getIncome() * 0.14;
        }
        else {
            return getIncome() * 0.16;
        }
    }

}
