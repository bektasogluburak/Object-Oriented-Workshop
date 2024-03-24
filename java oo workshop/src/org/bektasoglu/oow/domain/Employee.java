package org.bektasoglu.oow.domain;

public abstract class Employee implements IWorker  {
    protected int no;
    protected String name;
    protected double salary;
    protected int year;
    public final static int BASE_SALARY = 1_000;
    public Employee(int no, String name, int year)
    {
        this.no = no;
        this.name = name;
        this.year = year;
    }
    public double calculateSalary()
    {
        salary = year * BASE_SALARY;
        return salary;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
       return String.format("---Employee Info---%nNo: %d%nName: %s%nYear: %d%nSalary: %.2f%n",
               no, name, year,calculateSalary());
    }
}
