package com.integrationsi.salaries.api.situationfamiliale;

import java.time.LocalDate;

public record SituationFamilialeDto(
        Long id,
        Long salarieId,
        LocalDate dateDebut,
        LocalDate dateFin,
        String statut,
        Integer nombreEnfants,
        Integer nombrePersonnesACharge
) {
}
