package Lesson_3;

public class Lesson_3 {
    public static void main(String[] args) {
        Employee[] andersenTeam = new Employee[5];
        andersenTeam[0] = new Employee("Stanis", "Kairos", "Plushkins", "senior QA", "examle@gmail.com", "+77771123912", 40000, 28);
        andersenTeam[1] = new Employee("Alex", "Alexandrov", "Alexandrovich", "developer", "alex@gmail.com", "+77022602160", 40000, 43);
        andersenTeam[2] = new Employee("Александра", "Садковская", "Батьковна", "AQA", "alex@gmail.com", "+77777177757", 40000, 20);
        andersenTeam[3] = new Employee("Юрий", "Гагарин", "Алексеевич", "космонавт", "alex@gmail.com", "+77022902558", 40000, 34);
        andersenTeam[4] = new Employee("Alex", "Alexandrov", "Alexandrovich", "developer", "alex@gmail.com", "+77022902558", 40000, 45);
        for (int i = 0; i < andersenTeam.length; i++) {
            boolean b = andersenTeam[i].getAge() > 40;
            while (b) {
                System.out.println(andersenTeam[i].getEmployeeInfo());
                break;
            }
        }
    }
}
