public class Education extends Employee{

       private String department;
       private  String studentId;

    public Education(String name, String surname, int age, boolean graduation, boolean insurance, String department, String studentId) {
        super(name, surname, age, graduation, insurance);
        this.department = department;
        this.studentId = studentId;
    }

    @Override
    public void age() {
       if(super.age>15)
       {
           System.out.println("You are free to learn");
    }
}}

