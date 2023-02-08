import java.util.Scanner;

public class Employee {
    String name;
    String surname;
    int age;
boolean graduation;
boolean insurance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name, String surname, int age, boolean graduation, boolean insurance) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.graduation = graduation;
        this.insurance = insurance;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGraduation() {
        return graduation;
    }

    public void setGraduation(boolean graduation) {
        this.graduation = graduation;
    }

    public boolean isInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

public  void  age(){
        if(age >18){
            System.out.println("you are free");
        }
}
Scanner scanner=new Scanner(System.in);

    public Employee() {
    }

    public Employee data(){
        Employee e=new Employee();
        System.out.println("Enter name");
        name=scanner.next();
        System.out.println("Enter surname");
        surname=scanner.next();
        System.out.println("Enter age");
        age=scanner.nextInt();
        System.out.println("Is employee graduated?");
        graduation=scanner.nextBoolean();
        System.out.println("Has employee insuarance?");
        insurance=scanner.nextBoolean();

        return new Employee(name,surname,age,graduation,insurance);
    }
}
