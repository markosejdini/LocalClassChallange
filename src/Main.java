import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("John", "Alite", "24/2/2008");
        Employee e2 = new Employee("John", "cena", "7/2/2009");
        Employee e3 = new Employee("Joe", "Biden", "28/12/2019");
        Employee e4 = new Employee("Donald", "Trump", "28/12/2025");
        Employee e5 = new Employee("Hilary", "Clinton", "14/5/1998");

        List<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));

    }

    public static void printOrderedList(List<Employee> elist, String sortField) {

        int currentYear = LocalDate.now().getYear();

        class myEmployee {
            Employee containedEmployee;
            int yearsWorked;
            String fullName;

            public myEmployee(Employee containedEmployee) {
                this.containedEmployee = containedEmployee;
                yearsWorked= currentYear - Integer.parseInt(containedEmployee.hireDate().split("/")[2]);
                fullName= String.join(" ", containedEmployee.first(), containedEmployee.last());
            }
        }

    }
}
