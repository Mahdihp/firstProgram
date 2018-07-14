public class Dog extends Animal {


   /* public Dog() {
        // super();

    }*/

    public Dog(int age, String name, int speed) {
        super(age, name);
        this.speed = speed;
    }

    private int speed;
    private int age = 2;

    public int getSubAge() {
        return age;
    }

    public int getSuperAge() {
        return super.age;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        super.getAge();
        this.speed = speed;
    }

    @Override
    public void talk() {
        System.out.println("Hop Hop");
        super.talk();
    }

}

