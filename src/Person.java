public class Person {

    private final  String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }



    public boolean equals(Person p) {
        if (p == null)
            return false;
        return this.name.equals(p.name);
    }


}
