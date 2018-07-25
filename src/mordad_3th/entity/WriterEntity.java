package mordad_3th.entity;

public class WriterEntity {

    private int id;
    private String name;
    private int age;
    private String style;

    public WriterEntity() {
    }

    public WriterEntity(int id, String name, int age, String style) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.style = style;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "WriterEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", style='" + style + '\'' +
                '}';
    }
}
