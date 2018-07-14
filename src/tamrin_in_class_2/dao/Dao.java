package tamrin_in_class_2.dao;

import tamrin_in_class_2.model.Person;
import tamrin_in_class_2.model.Student;

import java.util.List;

public interface Dao<T extends Person> {

    public void addEntity(T person);
    public void deleteEntity(T person);
    public void updateEntity(T person);
    public T findByIdEntity(T person);
    public List<T> getAllEntity();
}
