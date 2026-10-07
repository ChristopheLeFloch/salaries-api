package com.integrationsi.salaries.api.carriere;

import java.time.LocalDate;

public record CarriereDto(
        Long id,
        Long salarieId,
        LocalDate dateDebut,
        LocalDate dateFin,
        String emploi,
        String classification,
        String niveau,
        String echelon,
        String coefficient,
        String categorieProfessionnelle
) {
}
