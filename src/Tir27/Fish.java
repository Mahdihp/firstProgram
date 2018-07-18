package Tir27;

public class Fish extends Animal {

    public Fish(int weight, int height, int x, int y) {
        super(weight, height, x, y);
    }

    public void move(int x, int y) {
        super.x += x;
    }
}
