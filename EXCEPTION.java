
import java.util.Scanner;

public class cwh_81
{
    public static void main(String[] args) {
        int[]marks=new int[3];
        marks[0]=12;
        marks[1]=13;
        marks[2]=14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array index");
        int ind=sc.nextInt();
        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();
        try
        {
        System.out.println("array/index: "+marks[ind]/number);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occured");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occured");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some exceptions occured");
            System.out.println(e);
        }


    }
}
