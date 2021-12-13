class mythr2 extends Thread {
    public mythr2(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Harshit is a good boy" + this.getName());
            i++;
        }
    }
}
public class cwh_74_Java_priorities {
    public static void main(String[] args) {
        mythr2 t1 = new mythr2("Harshit1");
        mythr2 t2 = new mythr2("Harshit2");
        mythr2 t3 = new mythr2("Harshit3");
        mythr2 t4 = new mythr2("Harshit4");
        mythr2 t5 = new mythr2("Harshit5(max priority)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
