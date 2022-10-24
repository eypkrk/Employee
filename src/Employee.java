public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    double tax = 0;
    double bonus = 0;
    double raiseSalary = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public void tax(double salary){
        this.salary = salary;

        if (salary > 1000){
            tax = salary * 0.03;
        }
        System.out.println("Vergi: " + tax);
    }
    public void bonus(int workHours){
        this.workHours = workHours;

        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        }
        System.out.println("Bonus: " +bonus);
    }

    public void raiseSalary(int year){
        this.hireYear = year;
        salary = (salary + bonus) - tax ;
        if (2021 - year < 10){
            raiseSalary = salary * 0.05;
        }
        if (9 < 2021 - year && 2021 - year < 20){
            raiseSalary = salary * 0.10;
        }
        if (2021 - year > 19){
            raiseSalary = salary * 0.15;
        }
        System.out.println("Şuan ki yıl 2021 işe başlama yılı " + year + " \nZam: " + raiseSalary);
    }

}