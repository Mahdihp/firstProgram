package Tir27;

public abstract class Animal {

    protected int weight;
    protected int height;
    protected int x;
    protected int y;


    public Animal(int weight, int height, int x, int y) {
        this.weight = weight;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public final int getWeight() {
        return weight;
    }

    public final void setWeight(int weight) {
        this.weight = weight;
    }

    public final int getHeight() {
        return height;
    }

    public final void setHeight(int height) {
        this.height = height;
    }

    public final int getX() {
        return x;
    }

    public final void setX(int x) {
        this.x = x;
    }

    public final int getY() {
        return y;
    }

    public final void setY(int y) {
        this.y = y;
    }

    public abstract void move(int x, int y);

}
