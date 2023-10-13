public class Company extends Employee implements TaxCount {
    private String branch;

    public Company(String name, int id, double salary, String country, String branch) {
        super(name, id, country, salary);
        this.branch = branch;
    }

    public Company(String branch) {
        this.branch = branch;
    }

    public String getbranch() {
        return branch;
    }

    @Override
    public double bonusCount() {
        if (getID() >= 1011 && getID() <= 1022) {
            return (getSalary() * 0.1);
        }
        if (getID() >= 1022) {
            return (getSalary() * 0.2);
        }
        return 0;
    }

    @Override
    public double totalTax() {
        return countTax(getSalary());
    }

    public void items() {
        try {
            if (isName() == false) {
                System.out.println("No name");
            } else {
                System.out.println("Name exist");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Name   : " + getName());
        System.out.println("ID     : " + getID());
        System.out.println("Branch : " + getbranch()+", "+getCountry());
        System.out.println("Salary : " + getSalary());
        System.out.println("Bonus  : " + bonusCount());
        if (getSalary() > 55000) {
            System.out.println("Tax    : " + totalTax());
        } else {
            System.out.println("Tax    : Not required");
        }
        if (totalTax() != 0) {
            System.out.println("Total  : " + (getSalary() + bonusCount() - totalTax()));
        }else{
             System.out.println("Total  : " + (getSalary() + bonusCount()));
        }
        System.out.println();

    }
}