package OOPS_Concept.Protected_Access;

public class Protected_Accessing {
    protected String Name;
    protected int age;
    protected int roll;

    protected Protected_Accessing(String Name, int age, int roll){
        this.Name = Name;
        this.age = age;
        this.roll = roll;
    }

    protected void Protector(){
        System.out.println("Protected get accessible");
    }
}
