package com.mklusek.hla.allele.archive.dao;

import com.mklusek.hla.allele.archive.entity.AlleleEntity;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

@RegisterConstructorMapper(AlleleEntity.class)
public interface AlleleDAO {
    @SqlQuery("SELECT * FROM alleles WHERE id = :id")
    AlleleEntity getAlleleById(final int id);

    @SqlQuery("SELECT * FROM alleles")
    List<AlleleEntity> getAll();
}
