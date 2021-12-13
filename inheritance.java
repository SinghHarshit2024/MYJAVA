class base{
    public int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
    public void printme(){
        System.out.println("I am a constructor");
    }
}
class derived extends  base{
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}
public class cwh_45_inheritance {
    public static void main(String[] args) {
        base b=new base();
        b.setX(4);
        System.out.println(b.getX());

        derived d=new derived();
        d.setX(4);
        System.out.println(d.getX());

        d.printme();
    }
}
