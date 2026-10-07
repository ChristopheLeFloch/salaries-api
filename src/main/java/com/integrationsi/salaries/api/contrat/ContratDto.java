package com.integrationsi.salaries.api.contrat;

import java.time.LocalDate;
import java.math.BigDecimal;

public record ContratDto(
        Long id,
        Long salarieId,
        String typeContrat,
        LocalDate dateDebut,
        LocalDate dateFin,
        BigDecimal tempsTravailHebdomadaire,
        BigDecimal tauxActivite,
        BigDecimal salaireBase,
        String devise
) {
}
