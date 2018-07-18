package Tir27;

public class Horse extends Animal {

    public Horse(int weight, int height, int x, int y) {
        super(weight, height, x, y);
    }

    public void move(int x, int y) {
        this.y += y;
    }

}
