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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
