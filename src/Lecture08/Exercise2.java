package Lecture08;

class Employee {
    final String id;
    final String firstName;
    final String lastName;
    double salaryPerMonth;

    Employee(String id, String firstName, String lastName, double salaryPerMonth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getName() {
        return firstName + lastName;
    }

    public double getAnnyalSalary() {
        return salaryPerMonth * 12;
    }

    public double raiseSalary() {
        return salaryPerMonth + (0.20 * salaryPerMonth);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salaryPerMonth=" + salaryPerMonth +
                '}';
    }


    public static class Exercise2 {
        public static void main(String[] args) {
            Employee employee = new Employee("123456789", "Ivan", "Ivanov", 1000 );
            System.out.println(employee.id);
            System.out.println(employee.getName());
            System.out.println(employee.getAnnyalSalary());

        }
    }
}


//Create class Employee with the following attributes – id, first name, last name, salary per month.
//
//Id, first name, last name – must be set only once
//
//Salary – can be updated any time
//
//Add the following methods – getName() / getAnnualSalary() / raiseSalary()
//
//getName – combines first name and last name
//
//getAnnyalSalary – return what the annual salary for the employee is
//
//raiseSalary – modify current salary by X% and return the update salary
//
//toString – should print all the information about the employee