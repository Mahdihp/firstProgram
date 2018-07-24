package tamrin_5.dao;

import tamrin_5.model.Person;

import java.util.List;

public interface Dao<T extends Person> {

    public void addEntity(T person);
    public void deleteEntity(T person);
    public T findByIdEntity(T person);
    public List<T> getAllEntity();
}
