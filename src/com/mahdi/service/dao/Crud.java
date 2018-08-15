package com.mahdi.service.dao;


import com.mahdi.service.model.Entity;

public interface Crud {

    void create(Entity entity) ;

    Entity read(int id);

    void update(Entity entity);

    void delete(int id);

    Entity[] readAll();

    void empty();
}
