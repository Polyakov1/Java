package AnotherClass;

import java.time.LocalDate;

public class Managers extends Employees {

    public Managers(String surname, String firstName, String lastName, LocalDate birthDate, String position, double salary)
    {
        super(surname, firstName, lastName, birthDate, position, salary);
    }

    public static void increaseSalary(Employees[] employees, double percentage)
    {
        for (Employees employee : employees)
        {
            if (!(employee instanceof Managers))
            {

                double currentSalary = employee.getSalary();
                double newSalary = currentSalary * (1 + percentage / 100);
                employee.setSalary(newSalary);

            }
        }
    }

}