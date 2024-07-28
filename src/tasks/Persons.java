package tasks;

public class Persons {
    //   public static void main(String[] args) {
    //    int a = 11;
    //  int[] n = new int[5];
    //  System.out.println(nm[4]);
//        for (int i = 0; i < n.length; i++) {
    //          n[i] = i * 11;
    //    }
    //  for (int i = 0; i < n.length; i++) {
    //    System.out.println(n[i]);
//        }
    //      int[] m = {1, 3, 4};
    //    for (int i = 0; i < m.length; i++) {
    //      System.out.println(m[i]);
    //      }
    //    int[] x = new int[5];
    //  x[0] = 11;
//        String[] p = new String[3];
    //      p[0] = "jj";
    //    p[1] = "ss";
    //  p[2] = "pp";
//        for (int i = 0; i < p.length; i++) {
    //          System.out.println(p[i]);
    //    }

//        int[] j = {1, 4, 9};
    //      int sum = 0;
    //    for (int y : j) {
    //      sum = sum + y;
//        }
    //      System.out.println(sum);

    //    int[] q = {4, 6, 8};
//        System.out.println(q[2]);



//        int[][] b = {{1, 3, 5, 2, 3},
    //              {3, 4, 5},
    //            {9, 7, 5}};
    //  System.out.println(b[1][1]);

    //     int[][] bb = {{1,2,3},
    //                 {5,1,2},
    //               {5,3,4}};
    //      for (int i =0; i<bb.length; i++) {
    //        for (int k = 0; k< bb.length; k++) {
    //          System.out.print(bb[i] [k] + " ");
    //    }
    //  System.out.println();
    //   }
    // }
//    }
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Ivan";
        person.age = 45;
        person.bb();
        Person pp1 = new Person();
        pp1.name = "Lara";
        pp1.age = 34;
        pp1.bb();
    }
}
class Person{
    String name;
    int age;

    void bb() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Меня зовут " + name + ",мне " + age + " лет");

        }

    }


}
