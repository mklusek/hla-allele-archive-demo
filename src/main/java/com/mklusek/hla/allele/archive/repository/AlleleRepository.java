package com.mklusek.hla.allele.archive.repository;

import com.mklusek.hla.allele.archive.dao.AlleleDAO;
import com.mklusek.hla.allele.archive.dto.AlleleDTO;
import com.mklusek.hla.allele.archive.mapper.AlleleMapper;
import org.jdbi.v3.core.Jdbi;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AlleleRepository {
    private final Jdbi jdbi;

    public AlleleRepository(final Jdbi jdbi){
        this.jdbi = jdbi;
    }

    public List<AlleleDTO> getAll(){
        return jdbi.withExtension(AlleleDAO.class, AlleleDAO::getAll).stream()
                .map(AlleleMapper::toDTO)
                .toList();
    }
}
