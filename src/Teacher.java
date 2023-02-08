public class Teacher extends Employee {


    private  String experiance;
    private  String area;

    public Teacher(String name, String surname, int age, boolean graduation, boolean insurance, String experiance, String area) {
        super(name, surname, age, graduation, insurance);
        this.experiance = experiance;
        this.area = area;
    }

    @Override
    public void age() {
        if (super.age<80){
            System.out.println("you can teach");
        }else System.out.println("go to pic");
    }
}

