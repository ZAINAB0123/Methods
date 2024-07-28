package tasks;

public class Box {
    public static void main(String[] args) {
        int c= 23;
        Integer boxed;

        boxed = new Integer(c);
        boxed = Integer.valueOf(c);
        boxed = c;

        Integer b = 123;
        int a = b.intValue();
        a = b;

        int e = 12;
        int k = 3;
        System.out.println(e<k);



    }
}
