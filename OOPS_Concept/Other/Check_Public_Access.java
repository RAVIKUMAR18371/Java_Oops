package OOPS_Concept.Other;
import OOPS_Concept.Public_Access.*;
public class Check_Public_Access {
    public static void main(String[] args){
        Public_Access pb = new Public_Access("Rahul", 22);

        System.out.println("Name: "+ pb.Name + " and Age: "+ pb.Age);
    }


}
