public enum EnumMultiTon {
    instance1(1), instance2(2), instance3(3);

    int age;

    EnumMultiTon(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
