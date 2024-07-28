package constr;

public class Constr2 {
    String name;
    int age;
String drinke(String type){
    return "drinke" + type;
}
    public static void main(String[] args) {
        Constr2 student = new  Constr2 ();
        student.name= "Nana";
        student.age =23;
        Constr2 student2 = new Constr2();
        student2.name = "Lola";
        student2.age= 32;
        System.out.println("У нас учится "+ student.name +" ей"+ student.age);
        System.out.println(student2.name+ "ей "+ student2.age);
        System.out.println("Она");
        String result = student2.drinke(" water");
        System.out.println(result);
}
}
