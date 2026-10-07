package com.integrationsi.salaries.api.affectation;

import java.time.LocalDate;

public record AffectationDto(
        Long id,
        Long salarieId,
        LocalDate dateDebut,
        LocalDate dateFin,
        String societe,
        String etablissement,
        String direction,
        String service,
        String poste,
        String centreCout
) {
}
