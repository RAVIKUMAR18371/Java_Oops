package OOPS_Concept.Interfaces;

public class Interfacer2 {
    interface I1{
        void window();
        void wheel();
    }

    class Bike implements I1{

        @Override
        public void window(){
            System.out.println("There is no window");
        }
        @Override
        public void wheel(){
            System.out.println("There is two wheel in a bike");
        }
    }

    class Car implements I1{

        public void window(){
            System.out.println("There are total 4 window in a car");
        }

        public void wheel(){
            System.out.println("There are four wheel exist in a car");
        }
    }

}
