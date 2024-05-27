package main;
import AnotherClass.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static AnotherClass.Employees.birthDateComparator;


public class Main {
    public static void main(String[] args)
    {
        Employees name1 = new Employees("1", "2", "3", LocalDate.of(9999, 5, 15), "", 22);
        Employees name2 = new Employees("2", "3", "4", LocalDate.of(123, 5, 12), "", 1);
        Employees name3 = new Employees("3", "4", "5", LocalDate.of(9932399, 5, 15), "", 2);
        Employees name4 = new Employees("4", "5", "6", LocalDate.of(2, 5, 15), "", 3);
        Employees name5 = new Employees("5", "6", "7", LocalDate.of(0, 5, 15), "", 444);
        Employees name6 = new Employees("6", "7", "8", LocalDate.of(1, 5, 13), "", 5555);
        Employees name7 = new Employees("7", "8", "9", LocalDate.of(33, 5, 15), "", 299992);
        Employees name8 = new Employees("8", "9", "0", LocalDate.of(22, 5, 15), "", 22);
        Employees name9 = new Employees("9", "0", "1", LocalDate.of(323, 12, 16), "", 22);
        Employees name0 = new Employees("Станислов", "Байраковский", "2", LocalDate.of(35, 5, 15), "Ревьюер", 999999);

        cheek(name1, name0);

        Managers Boss = new Managers("SUPER_NAME", "SUPER", "NAME", LocalDate.of(1945, 9, 2), "Руководитель организации OOH", 410);

        Employees[] employees = {name1, name2, name3, name4, name5, name6, name7, name8, Boss};

        for (Employees employee : employees) {
            System.out.println(employee.getSurname() + " " + employee.getFirstName() + ", '" + employee.getPosition() + "' " + ": " +
                    "до повышения - " + employee.getSalary());
        }
        System.out.println("=#=#=#=#=#=#=#=#=");


        Managers.increaseSalary(employees, 10);

        for (Employees employee : employees) {
            System.out.println(employee.getSurname() + " " + employee.getFirstName() + ", '" + employee.getPosition() + "' " + ": " +
                    "после повышения - " + employee.getSalary());
        }


    }
    public static void cheek(Employees nameFirst, Employees nameSecond){
        if (birthDateComparator().compare(nameFirst, nameSecond) > 0) {
            System.out.println(nameFirst.getFirstName() + " старше, чем " + nameSecond.getFirstName());
            System.out.println("=#=#=#=#=#=#=#=#=");
        }else if (birthDateComparator().compare(nameFirst, nameSecond) < 0) {
            System.out.println(nameFirst.getFirstName() + " младше, чем " + nameSecond.getFirstName());
            System.out.println("=#=#=#=#=#=#=#=#=");
        } else {
            System.out.println(nameFirst.getFirstName() + " и " + nameSecond.getFirstName() + " родились в один день");
            System.out.println("=#=#=#=#=#=#=#=#=");
        }
    }
}