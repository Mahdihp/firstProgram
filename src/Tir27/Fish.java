package Tir27;

public final class Fish extends Animal {

    public Fish(int weight, int height, int x, int y) {
        super(weight, height, x, y);
    }

    @Override
    public final void move(int x, int y) {
        super.x += x;
    }
}
