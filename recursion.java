import java.util.Scanner;

public class cwh_34_recursion {

        static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else;
        return n*factorial(n-1);
    }
    static int factorial_iterative(int x){
            if(x==0||x==1){
                return 1;
            }
            int product=1;
            for(int i=1;i<=x;i++){
                product*=i;
            }
            return product;
    }

     public static void main(String[] args) {

                Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("Enter the value whose factorial you want");
        x=sc.nextInt();
        System.out.println("The value of factorial x is "+factorial(x));
         System.out.println("The value of factorial x is "+factorial_iterative(x));
    }
}
