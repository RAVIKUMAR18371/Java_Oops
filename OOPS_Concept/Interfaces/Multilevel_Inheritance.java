package OOPS_Concept.Interfaces;

public class Multilevel_Inheritance {
    static class A{
        public void show(){
             System.out.println("This is from Parent class");
         }
    }

  static class B extends A{
       public void show(){
            System.out.println("This is from child class");
        }
    }

    static class C extends B{
        public void show(){
            System.out.println("This is Child's child class");
        }
    }

   static class Test{
        public static void main(String[] args){
            A obj = new A();
            B obj1 =  new B();
            obj.show();
            obj1.show();
        }
    }
}
