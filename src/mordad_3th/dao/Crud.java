package mordad_3th.dao;

import mordad_3th.entity.Entity;

public interface Crud {

    boolean create(Entity entity);

    Entity read(int id);

    boolean update(Entity entity);

    boolean delete(int id);

    Entity[] readAll();

    boolean empty();
}
