public class cwh_31_java_methods {
    static int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }


    public static void main(String[] args){

        int a=5;
        int b=6;
        int c;
        //method invocation using java creation.
        //cwh_30_java_methods obj = new cwh_30_java_methods();
        //c=obj.logic(a,b);
        c=logic(a,b);
        int a1=4;
        int b1=2;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c1);
        System.out.println(c);
    }
}

