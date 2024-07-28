package tasks;

// Дано  целое число n, оно от1 до 99
// Мне n лет, но при необходимости вместо лет пишется  год или года
// Мне 1 год, мне 2 года, мне 3 года. мне 25 лет

public class Years2 {
        public static void main(String[] args) {
       myYears(38);
    }
    public static void myYears (int years) {
            if( years<1 || years>99) {
                System.out.println("Возраст введен не правильно " +years);
                return;
            }
            String result = "";
            int lastInteger = years % 10;
            if (years>=5 && years<=20) {
                result = "лет";
            } else {
                switch (lastInteger) {
                    case 1:
                        result= "год";
                        break;
                    case 2,3,4:
                        result = "года";
                        break;
                    case 5,6,7,8,9,0:
                        result = "лет";
                        break;
                }

            }
        System.out.println("Мне" + years +""  + result);
    }




}
