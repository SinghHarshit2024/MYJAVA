class base1 {
    public int x;

    base1() {
        System.out.println("I am  a constructor");
    }
    base1(int x) {
        System.out.println("I am  a constructor with value of x as: "+ x);
    }

}
    class derived1 extends base1{
        public int y;
        derived1(){
            super(0);
            System.out.println("I am derived class constructor");
        }
        derived1(int x,int y){
            super(x);
            System.out.println("I am overload constructor of derived with value of y as:  "+ y);
        }
    }

    class childofderived extends derived1{
    childofderived(){
        System.out.println("I am child of derived constructor");
    }
    childofderived(int x,int y, int z){
        super(x,y);
        System.out.println("I am overloaded constructor of derived with value of z as: "+ z);
    }
    }

public class cwh_46_construction_in_inheritance {
    public static void main(String[] args) {
               // base1 b = new base1();
              //derived1 d = new derived1();
             // derived1 d = new derived1(4,5);
             //childofderived cd = new childofderived();
        childofderived cde = new childofderived(5,5,6);
    }
    }
