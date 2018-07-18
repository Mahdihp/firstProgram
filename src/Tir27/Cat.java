package Tir27;

public class Cat extends Animal {

    public Cat(int weight, int height, int x, int y) {
        super(weight, height, x, y);
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
}
