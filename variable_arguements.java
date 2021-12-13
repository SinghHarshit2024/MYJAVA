public class cwh_33_variable_arguments {
    static int sum(int ...arr){
        //avaiable as int [] arr.
        int result =0;
        for(int a: arr){
         result+=a;
        }
        return(result);
    }
//    static int sum(int a, int b) {
//        return a + b;
//    }
//
//    static int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//    static int sum(int a, int b, int c,int d) {
//        return a + b + c + d;
//    }



    public static void main(String[] args) {
        System.out.println("The sum of nothing is "+sum());
        System.out.println("the sum of 4+5 is "+sum(4,5));
        System.out.println("the sum of 4+5+6 is "+sum(4,5,6));
        System.out.println("the sum of 4+5+6 is "+sum(4,5,6,7));

    }
}





