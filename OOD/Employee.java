

public abstract class Employee {
    private String name;
    private int id;
    private String country;
    private double salary;

    public abstract double bonusCount();

    public Employee() {
    };

    public Employee(String name, int id, String country, double salary) {
        this.name = name;
        this.id = id;
        this.country = country;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getID() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isName() {
        try {
            if (getName() == null) {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

}