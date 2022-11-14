package com.example.minimini.service;

import com.example.minimini.ifs.CrudInterface;
import com.example.minimini.model.network.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class BaseService<Req, Res, Entity> implements CrudInterface<Req, Res> {

    @Autowired(required=false)
    protected JpaRepository<Entity, Long> baseRepository;
}
