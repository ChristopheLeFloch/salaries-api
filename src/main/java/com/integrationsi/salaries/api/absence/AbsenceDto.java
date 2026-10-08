package com.integrationsi.salaries.api.absence;

import java.time.LocalDate;
import java.math.BigDecimal;

import com.integrationsi.salaries.api.common.CodeLibelle;

public record AbsenceDto(
        Long id,
        Long salarieId,
        CodeLibelle typeAbsence,
        LocalDate dateDebut,
        LocalDate dateFin,
        BigDecimal nombreJours,
        String commentaire
) {
}
