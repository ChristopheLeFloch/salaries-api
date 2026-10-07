package com.integrationsi.salaries.api.carriere;

import java.time.LocalDate;

import com.integrationsi.salaries.api.common.CodeLibelle;

public record CarriereDto(
        Long id,
        Long salarieId,
        LocalDate dateDebut,
        LocalDate dateFin,
        CodeLibelle emploi,
        CodeLibelle classification,
        CodeLibelle niveau,
        CodeLibelle echelon,
        CodeLibelle coefficient,
        CodeLibelle categorieProfessionnelle
) {
}
