class mythreadrunnable1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("I am thread1 not a threat 1");
            i++;
        }
    }
}
    class mythreadrunnable2 implements Runnable {
        public void run() {
            int i = 0;
            while (i < 100) {
                System.out.println("I am thread2 not a threat 2");
                i++;
            }
        }
    }

    public class cwh_71_runnable {
        public static void main(String[] args){
            mythreadrunnable1 bullet1 = new mythreadrunnable1();
            Thread gun1 = new Thread(bullet1);
            mythreadrunnable2 bullet2 = new mythreadrunnable2();
            Thread gun2 = new Thread(bullet2);
            gun1.start();
            gun2.start();
        }
    }


