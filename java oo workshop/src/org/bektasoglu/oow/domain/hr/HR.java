package org.bektasoglu.oow.domain.hr;
import org.bektasoglu.oow.domain.IWorker;

public class HR {
    public void paySalary(IWorker w)
    {
        double salary = w.calculateSalary();
        System.out.println("Paying: " + w.getName() + "salary: " + salary);
    }
}
