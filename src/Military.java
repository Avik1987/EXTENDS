public class Military extends Employee{
    private String Id;

    @Override
    public void age() {
        if ( super.age<60){
            System.out.println(" you can serve");
        }else System.out.println("go to rest");
    }

    public Military(String name, String surname, int age, boolean graduation, boolean insurance, String id) {
        super(name, surname, age, graduation, insurance);
        Id = id;
    }


    public String getId () {
        return Id;
    }

    public void setId (String id){
        Id = id;
    }

}