import Tir27.Animal;
import Tir27.Cat;
import Tir27.Fish;
import Tir27.Horse;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Animal animal = null;
        int a = new Scanner(System.in).nextInt();
        switch (a) {
            case 1:
                animal = new Cat(10, 10, 10, 10);
                break;
            case 2:
                animal = new Fish(10, 10, 10, 10);
                break;
            default:
                animal = new Horse(10, 10, 10, 10);
                break;
        }

        animal.getHeight();
    }


}
