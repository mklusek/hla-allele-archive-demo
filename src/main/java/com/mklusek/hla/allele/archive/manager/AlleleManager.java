package com.mklusek.hla.allele.archive.manager;

import com.mklusek.hla.allele.archive.repository.AlleleRepository;
import com.mklusek.hla.allele.archive.dto.AlleleDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AlleleManager {
    @Autowired
    private AlleleRepository alleleRepository;

    public List<AlleleDTO> getAll() {
        return alleleRepository.getAll();
    }
}
