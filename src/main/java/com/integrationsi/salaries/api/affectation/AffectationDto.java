package com.integrationsi.salaries.api.affectation;

import java.time.LocalDate;

import com.integrationsi.salaries.api.common.CodeLibelle;

public record AffectationDto(
        Long id,
        Long salarieId,
        LocalDate dateDebut,
        LocalDate dateFin,
        CodeLibelle societe,
        CodeLibelle etablissement,
        CodeLibelle direction,
        CodeLibelle service,
        String poste,
        CodeLibelle centreCout
) {
}
