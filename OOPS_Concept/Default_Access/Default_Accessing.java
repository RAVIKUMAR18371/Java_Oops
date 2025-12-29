package OOPS_Concept.Default_Access;
import java.util.Scanner;
class Default_Accessing {

    int n;
    String Butter;

    Default_Accessing(int n, String Butter){
        this.n = n;
        this.Butter = Butter;
    }

    void Default_Accessing(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element in the array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        Default_Accessing df = new Default_Accessing(2, "Hey Give me");

        df.Default_Accessing(arr);

    }

}
