package com.company;
class m_employ {
    private int salary;
    private String name;
    public m_employ(String Nme,int sal){
        salary = sal;
        name = Nme;
    }
    public m_employ(){
          salary = 45000;
          name = "Harshit Singh";
    }
    public String getname(){
        return name;
    }
   // public void setname(String n){
    //    this.name = n;
    //}
   public int getsalary(){
        return salary;
   }
   // public void setsalary(int s){
    //    this.salary = s;
    }
//}
public class cwh_42_constructors {
    public static void main(String[] args) {
          m_employ Harsh = new m_employ();

//        Harsh.salary = 1200;
//        Harsh.name = "Harshit"//through an error due to private access modifiers.
//        Harsh.setname("Harshit");
          System.out.println(Harsh.getname());
//        Harsh.setsalary(15000);
          System.out.println(Harsh.getsalary());
    }
}
