package Lesson_3;

public class Employee {

    private String firstName;
    private String lastName;
    private String middleName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String firstName,
                    String lastName,
                    String middleName,
                    String position,
                    String email,
                    String phoneNumber,
                    int salary,
                    int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getEmployeeInfo() {
        return "ФИО сотрудника: " + firstName + " " + lastName + " " + middleName +
                "\nДолжность: " + position +
                "\nПочта: " + email +
                "\nНомер для связи:  " + phoneNumber +
                "\nЗаработная плата: " + salary +
                "\nВозраст: " + age;
    }

    public int getAge() {
        return age;
    }

    public static void checkAge(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                System.out.println(employees[i].getEmployeeInfo());
            }
        }
    }
}
