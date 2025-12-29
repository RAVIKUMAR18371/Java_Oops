package OOPS_Concept.Interfaces;

public class Multiple_Inheritance {
    interface Add {
        int add(int a, int b);
    }

    interface Sub {
        int sub(int a, int b);
    }

   static class Cal implements Add, Sub {

        @Override
        public int add(int a, int b) {
            return a + b;
        }

        @Override
        public int sub(int a, int b) {
            return Math.abs(a - b);
        }
    }

    public static void main(String[] args) {
        Cal cal = new Cal();
        System.out.println(cal.add(2,3));
        System.out.println(cal.sub(4,6));

    }
}
