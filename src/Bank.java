public class Bank extends Employee{


    private int bankAccount;
    private  String id;

    public Bank(String name, String surname, int age, boolean graduation, boolean insurance, int bankAccount, String id) {
        super(name, surname, age, graduation, insurance);
        this.bankAccount = bankAccount;
        this.id = id;
    }

    @Override
    public void age() {
       if (super.age>25 && super.age<60){
           System.out.println("You can open bank account");
       }else System.out.println(" You are too yang or old");
    }
}
