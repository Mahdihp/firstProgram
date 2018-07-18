package Tir27;

public final class Cat extends Animal {

    public Cat(int weight, int height, int x, int y) {
        super(weight, height, x, y);
    }


    @Override
    public final void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
}
