class myexception extends Exception{
    public String toString(){
        return " I am toString";
    }
    public String getMessage(){
        return " I am getMessage()";
    }
}
public class cwh_83_exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        if(a<9){
            try
            {
               throw new myexception();
               // throw new ArithmeticException("This is my exception");
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}
