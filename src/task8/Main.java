package task8;

import JAVACORE.Dragon;
import JAVACORE.Ogre;

public class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon("Cat");
        Ogre ogre = new Ogre("Dog");
        dragon.defend(ogre);
        System.out.println(dragon);
        System.out.println(ogre);
    }
}


