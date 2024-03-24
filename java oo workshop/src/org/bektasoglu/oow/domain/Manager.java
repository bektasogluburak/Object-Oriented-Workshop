package org.bektasoglu.oow.domain;

public class Manager extends Employee {

    protected String department;
    public final static int MANAGEMENT_PAYMENT = 10_000;
    public Manager(int no, String name, int year, String department)
    {
        super(no, name, year);
        this.department = department;
    }

    public void work()
    {
        System.out.println("Manager " + name + " is working. ");
        manage();
    }
    public String toString()
    {
        return String.format("---Manager Info---%nNo: %d%nName: %s%nYear: %d%nSalary: %.2f%n",
                no, name, year,calculateSalary());
    }
    @Override
    public double calculateSalary()
    {
        salary = MANAGEMENT_PAYMENT + super.calculateSalary();
        return salary;
    }
    public void manage()
    {
        System.out.println("Manager " + name + " is managing");
    }
}
