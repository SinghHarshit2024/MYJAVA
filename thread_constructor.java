package com.company;
class mythr extends Thread{
    public mythr(String name){
        super(name);
    }
    public void run(){

        System.out.println("Hello Harshit");
    }
}
public class cwh_73_thread_constructor {
    public static void main(String[] args) {
        mythr t1 = new mythr("Harshit");
        mythr t2 = new mythr("Harry");
        t1.start();
        t2.start();
        System.out.println("The id of thread t is "+ t1.getId());
        System.out.println("The name of thread t is "+ t1.getName());
        System.out.println("The id of thread t is "+ t2.getId());
        System.out.println("The name of thread t is "+ t2.getName());
    }
}
