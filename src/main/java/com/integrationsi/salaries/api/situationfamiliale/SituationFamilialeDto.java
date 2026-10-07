package com.integrationsi.salaries.api.situationfamiliale;

import java.time.LocalDate;

import com.integrationsi.salaries.api.common.CodeLibelle;

public record SituationFamilialeDto(
        Long id,
        Long salarieId,
        LocalDate dateDebut,
        LocalDate dateFin,
        CodeLibelle statut,
        Integer nombreEnfants,
        Integer nombrePersonnesACharge
) {
}
