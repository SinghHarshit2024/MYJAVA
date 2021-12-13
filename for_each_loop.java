public class cwh_26_for_each_loop {
    public static void main(String[] args) {
//        int [] marks={3,4,5,6};
//        System.out.println(marks.length);
//        float [] mark={1.2f,3.3f,4.5f,5.8f};
//        System.out.println(mark.length);
//        System.out.println(mark[2]);
//        String [] name={"Harshit","Singh harshit","Lalla"};
//        System.out.println(name[1]);

         // display the error using (for loop).
//            int[]marks={2,3,4,6,7};
//            System.out.println("using for loop");
//           for(int i=0;i<marks.length;i++)
//           {
//               System.out.println(marks[i]);
//           }
//        System.out.println("using for loop in reverse order");
//           for(int i=marks.length-1;i>=0;i--)
//           {
//            System.out.println(marks[i]);
//           }
//
       System.out.println("using (for - each loop)");
       int[] mark={2,3,4,5};
        for(int element: mark)
        {
            System.out.println(element);
        }
    }
}
