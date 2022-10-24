import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("Isim: ");
        String name = tara.nextLine();
        System.out.println("Maas: ");
        double salary = tara.nextDouble();
        System.out.println("Kac Saat Mesai Yaptiniz: ");
        int hours = tara.nextInt();
        System.out.println("Yili Giriniz: ");
        int year = tara.nextInt();
        System.out.println("İsim:" + name);
        System.out.println("Maaş: " + salary);
        System.out.println("Çalışma saati: "+ hours);

        Employee employee = new Employee();
        employee.tax(salary);
        employee.bonus(hours);
        employee.raiseSalary(year);
        salary = salary + employee.bonus;
        double taxSalary = salary - employee.tax;
        System.out.println("Vergi ve Bonuslarla Maaş: " + taxSalary);
        System.out.println("Toplam Maaş: " + (taxSalary + employee.raiseSalary));

    }
}