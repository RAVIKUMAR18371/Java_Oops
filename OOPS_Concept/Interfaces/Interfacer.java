package OOPS_Concept.Interfaces;

interface I1{
     int val = 10;// Inside basically Java Converts this into --> public static final int val = 10

     void display(String name);

}
public class Interfacer implements I1 {
    @Override
    public void display(String name){
        System.out.println("This is my word");
    }

    public static void main(String[] args){
        Interfacer I2 = new Interfacer();
        I2.display("Ravi");
    }

}
