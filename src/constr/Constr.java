package constr;

public class Constr {
        String name;
        int age;
        static int count = 0;
        void writeCode(){
            System.out.println("writeCode");
        }
String drink(String type){
    return  "drink" + type;
}
String eatBurger(){
    return "eatBurger";
}
public Constr(String name, int age) {
            this.name = name;
            this.age = age;
}
public Constr(){

}
    public static void main(String[] args) {
        Constr programmer1 = new Constr("Zack",23);
  //      programmer1.name = "Zack";
   //     programmer1.age = 23;
        count++;
         Constr programmer2 = new Constr("Katy",32);
       //  programmer2.name = "Katy";
      //   programmer2.age = 32;
         count++;
         Constr programmer3 = new Constr("Eva",22);
      //   programmer3.name= "Eva";
      //   programmer3.age= 24;
         count++;
        System.out.println(programmer1.name+"сейчас");
        String result =  programmer1.eatBurger();
        System.out.println(result);
        System.out.println(" У нас работает" + programmer2.name + "возраст" + programmer2.age);
        System.out.println("В компании работает" +count +"программиста");
    }
}