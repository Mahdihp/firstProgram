package com.mahdi.service.dao;

import mordad_3th.entity.Entity;

import java.sql.SQLException;

public interface Crud {

    void create(Entity entity) ;

    Entity read(int id);

    void update(Entity entity);

    void delete(int id);

    Entity[] readAll();

    void empty();
}
