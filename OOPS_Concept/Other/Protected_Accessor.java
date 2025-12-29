package OOPS_Concept.Other;

import OOPS_Concept.Protected_Access.*;
public class Protected_Accessor extends Protected_Accessing {

    public Protected_Accessor() {
        super("Ravi", 22, 21); // it is basically defined so that this constructor basically refer to the
                                               // parent class --> Protected_Accessing
    }

    public static void main(String[] args){
        Protected_Accessor pp = new Protected_Accessor();
        System.out.println(pp.Name);
        System.out.println(pp.age);
        System.out.println(pp.roll);
    }


}
