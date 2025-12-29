package OOPS_Concept.Public_Access;

public class Public_Access {
    public String Name;
    public int Age;

    public Public_Access(String Name, int Age){
        this.Name = Name;
        this.Age  = Age;
    }


    public static void main(String[] args){
        Public_Access pb = new Public_Access("Ravi", 22);
        System.out.println(pb.Name);
        System.out.println(pb.Age);

    }
}
