package Tir27;

public final class Horse extends Animal {

    public Horse(int weight, int height, int x, int y) {
        super(weight, height, x, y);
    }

    @Override
    public final void move(int x, int y) {
        this.y += y;
    }

}
