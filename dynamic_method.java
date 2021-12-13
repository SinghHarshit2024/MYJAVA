package com.company;
class phone{
    public void showtime(){
        System.out.println("Time is 8:00 am");
    }
    public void on(){
        System.out.println("Turning on........");
    }
}
class smartphone extends phone{
    public void music(){
        System.out.println("Play music");
    }
    public void on(){
        System.out.println("Khul raha hai...");
    }
}
public class cwh_49_dynamic_method_dispatch {
    public static void main(String[] args) {
        phone obj = new smartphone();  //Yes it is allowed.
        //smartphone obj2 = new phone(); //not allowed
        obj.showtime();
        obj.on();
        //obj.music();   //Not allowed
    }
}
