package org.bektasoglu.oow.test;

import org.bektasoglu.oow.domain.*;
import org.bektasoglu.oow.domain.hr.HR;

public class Test {
    public static void main(String[] args)
    {
       run2();
       run3();
       run4();
    }
  /*  private static void run1()
    {

  }*/
    private static void run2()
    {
        /*  Employee e = new Employee(10, "Ali", 15);
        System.out.println(e);
        var salary = e.calculateSalary();
        System.out.println(salary);
*/
        System.out.println();

        Employee e = new Manager(2,"Zeynep", 10, "Sales");
        System.out.println(e);
        var salary = e.calculateSalary();
        System.out.println(salary);
        // e.manage();

        System.out.println();

        e = new Director(3,"Mahmut", 10, "Company", 20_000);
        System.out.println(e);
        salary = e.calculateSalary();
        System.out.println(salary);
      //  e.manage();
      //  e.makaAStrategicPlan();
    }

    private static void run3()
    {
        HR hr = new HR();
        Employee e = new Engineer(10, "Ali", 15, "SWE");
        hr.paySalary(e);
        System.out.println();

        e = new Manager(2,"Zeynep", 10, "Sales");
        hr.paySalary(e);
        // e.manage();

        System.out.println();

        e = new Director(3,"Mahmut", 10, "Company", 20_000);
        hr.paySalary(e);
        //  e.manage();
        //  e.makaAStrategicPlan();
    }
    private static void run4()
    {
        HR hr = new HR();
        IWorker iWorker = new Engineer(10, "Ali", 15, "SWE");
        hr.paySalary(iWorker);
        System.out.println();

        iWorker = new Manager(2,"Zeynep", 10, "Sales");
        hr.paySalary(iWorker);
        // e.manage();

        System.out.println();

        iWorker = new Director(3,"Mahmut", 10, "Company", 20_000);
        hr.paySalary(iWorker);
        //  e.manage();
        //  e.makaAStrategicPlan();
    }
}
