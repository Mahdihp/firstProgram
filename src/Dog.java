public class Dog {


   /* public Dog() {
        // super();

    }*/

    public Dog(int age, String name, int speed) {

        this.speed = speed;
    }

    private int speed;
    private int age = 2;

    public int getSubAge() {
        return age;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}

