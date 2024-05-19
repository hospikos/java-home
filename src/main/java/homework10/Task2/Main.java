package homework10.Task2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("Minnie", "Mouse", "01/02/2015");
        Employee e2 = new Employee("Mickie", "Mouse", "05/08/2000");
        Employee e3 = new Employee("Daffy", "Duck", "11/02/2011");
        Employee e4 = new Employee("Daisy", "Duck", "05/03/2013");
        Employee e5 = new Employee("Goofy", "Dog", "23/07/2020");

        List<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));

        printOrderedList(list, "name");
        System.out.println();
        printOrderedList(list, "year");
    }


    public static void printOrderedList(List<Employee> employees, String criteria) {

        class EmployeeDetails {
            private final Employee employee;
            private final String fullName;
            private final int yearsWorked;
            private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            EmployeeDetails(Employee employee) {
                this.employee = employee;
                this.fullName = employee.firstName() + " " + employee.lastName();
                this.yearsWorked = calculateYearsWorked(employee.hireDate());
            }

            private int calculateYearsWorked(String hireDate) {
                LocalDate hireDateParsed = LocalDate.parse(hireDate, formatter);
                return Period.between(hireDateParsed, LocalDate.now()).getYears();
            }

            public String getFullName() {
                return fullName;
            }

            public int getYearsWorked() {
                return yearsWorked;
            }

            @Override
            public String toString() {
                return "Employee: " + fullName + ", Years Worked: " + yearsWorked;
            }
        }

        List<EmployeeDetails> detailsList = new ArrayList<>();
        for (Employee employee : employees) {
            detailsList.add(new EmployeeDetails(employee));
        }

        if ("name".equalsIgnoreCase(criteria)) {
            Collections.sort(detailsList, new Comparator<EmployeeDetails>() {
                @Override
                public int compare(EmployeeDetails e1, EmployeeDetails e2) {
                    return e1.getFullName().compareTo(e2.getFullName());
                }
            });
        } else if ("year".equalsIgnoreCase(criteria)) {
            Collections.sort(detailsList, new Comparator<EmployeeDetails>() {
                @Override
                public int compare(EmployeeDetails e1, EmployeeDetails e2) {
                    return Integer.compare(e2.getYearsWorked(), e1.getYearsWorked());
                }
            });
        }

        for (EmployeeDetails details : detailsList) {
            System.out.println(details);
        }
    }
}
