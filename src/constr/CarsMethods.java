package constr;

public class CarsMethods {
    String marka;
    String color;
    static int count= 0;  //count-счетчик
String carRides(){   //  (машина едет) String возвращает строковую переменную;
    return "car rides";
}
void theCarIsStanding(){       // (машина стоит)  void метод ничего не возвращает;
    System.out.println("the car is standig");
}
String theCarTurned(String type) {           //(машина повернула);    theCarTurned(String TYPE)- входные параметры;
    return "the car turned"+ type;
}
public CarsMethods(String marka, String color) {
    this.marka= marka;  //конструктор с параметрами;
    this.color= color;
    }
    public CarsMethods(){      //конструктор без параметров:

    }
    public static void main(String[] args) {
        CarsMethods car1 = new CarsMethods("BMW", "red");    // с конструктором
       // car1.marka = "BMW";
      //  car1.color= "red";
        count++;
        CarsMethods car2 = new CarsMethods("Audi", "blue"); // с конструктором
     //   car2.marka = "Audi";
     //   car2.color = "blue";
        count++;
        CarsMethods car3 = new CarsMethods();
        car3.marka = "Honda";
        car3.color= "White";
        count++;
        System.out.println("В компании " +count + " машины");
        System.out.println("У нас на автопарке есть машина "+ car1.marka+ " Цвет "+ car1.color);
        System.out.println(car1.marka+ " Сейчас");
        String result = car1.carRides();  //присвоили результат переменной (только со String)
        System.out.println(result);         // и переменную вывели на экран
        System.out.println("У нас на автопарке есть машина "+ car2.marka+ " Цвет "+ car2.color);
        System.out.println(car2.marka+ " Сейчас");
        car2.theCarIsStanding();
        System.out.println(car2.marka+" Сейчас");
        System.out.println(car2.theCarTurned(" left"));
        System.out.println("У нас на автопарке есть машина "+ car3.marka+ " Цвет "+ car3.color);
        System.out.println(car3.marka+ " Сейчас");
        System.out.println(car3.carRides());
    }

}
