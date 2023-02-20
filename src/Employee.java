public class Employee {
    String name;
    double salary;
    int workHour;
    int hireYear;

    public Employee(String name, double salary, int workHour, int hireYear){

        this.name = name;
        this.salary = salary;
        this.workHour = workHour;
        this.hireYear = hireYear;

    }

    public double tax(){
        if(this.salary < 1000){
            return 0.0D;
        }else{
            return this.salary * 0.03D;
        }
    }

    public double bonus(){
        if(this.workHour <= 40){
            return 0.0D;
        }else{
            return ((double) this.workHour - 40.0D) * 30.0D;
        }
    }

    public double raiseSalary(){
        if(2021 - this.hireYear < 10){
            return this.salary * 0.05D;
        }else if(this.hireYear > 9 && this.hireYear < 20){
            return this.salary * 0.1D;
        }else{
            return this.salary * 0.15D;
        }
    }

    public void print(){
        System.out.println("Çalışanın Adı: " + this.name);
        System.out.println("Çalışanın Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHour);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş: " + (this.salary - tax() + bonus()));
        System.out.println("Toplam Maaş: " + (this.salary + raiseSalary()));
    }
}
