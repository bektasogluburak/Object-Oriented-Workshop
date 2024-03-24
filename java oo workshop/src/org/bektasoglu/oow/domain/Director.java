package org.bektasoglu.oow.domain;

public class Director extends Manager {
    protected int bonus;
    public Director(int no, String name, int year, String department, int bonus)
    {
        super(no, name, year, department);
        this.bonus = bonus;
    }

    public String toString()
    {
        return String.format("---Director Info---%nNo: %d%nName: %s%nYear: %d%nSalary: %.2f%n",
                no, name, year,calculateSalary());
    }
    public void work()
    {
        System.out.println("Director " + name + " is working. ");
        manage();
    }

    public void manage()
    {
        System.out.println("Director " + name + " is managing");
        makaAStrategicPlan();
    }
    @Override
    public double calculateSalary()
    {
        salary = bonus + super.calculateSalary() ;
        return salary;
    }

    public void makaAStrategicPlan()
    {
        System.out.println("Director " + name + " is make a strategic plan");
    }
}
