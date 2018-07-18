import Tir27.*;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Parent();
        Parent parentRefToChild = new Child();

//        parent.f();
//        child.f();
//        parentRefToChild.f();


        SomeClass square = new SomeClass();
        square.method(parent);
        square.method(parentRefToChild);
    }


}
