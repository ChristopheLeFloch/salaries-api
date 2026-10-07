package com.integrationsi.salaries.api.contrat;

import java.time.LocalDate;
import java.math.BigDecimal;

import com.integrationsi.salaries.api.common.CodeLibelle;

public record ContratDto(
        Long id,
        Long salarieId,
        CodeLibelle typeContrat,
        LocalDate dateDebut,
        LocalDate dateFin,
        BigDecimal tempsTravailHebdomadaire,
        BigDecimal tauxActivite,
        BigDecimal salaireBase,
        CodeLibelle devise
) {
}
