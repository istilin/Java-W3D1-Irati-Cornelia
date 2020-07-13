package A1;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.setName("John");
        employee1.setSurname("Doe");
        employee1.setYearOfBirth(1989);
        employee1.setSalary(1300);

        employee2.setName("Johana");
        employee2.setSurname("Doana");
        employee2.setYearOfBirth(1990);
        employee2.setSalary(1400);

        employee3.setName("Marian");
        employee3.setSurname("Toanete");
        employee3.setYearOfBirth(1988);
        employee3.setSalary(1500);

        System.out.println(employee1.getName());
        System.out.println(employee1.getSurname());
        System.out.println(employee1.getYearOfBirth());
        System.out.println(employee1.getSalary());

        System.out.println(employee2.getName());
        System.out.println(employee2.getSurname());
        System.out.println(employee2.getYearOfBirth());
        System.out.println(employee2.getSalary());

        System.out.println(employee3.getName());
        System.out.println(employee3.getSurname());
        System.out.println(employee3.getYearOfBirth());
        System.out.println(employee3.getSalary());


    }
}
