package com.mklusek.hla.allele.archive.mapper;

import com.mklusek.hla.allele.archive.dto.AlleleDTO;
import com.mklusek.hla.allele.archive.entity.AlleleEntity;
import org.springframework.stereotype.Component;

@Component
public class AlleleMapper {
    public static AlleleDTO toDTO(final AlleleEntity entity) {
        return new AlleleDTO(entity.getAccessionNumber(), entity.getName());
    }
}
