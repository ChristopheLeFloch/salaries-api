package com.integrationsi.salaries.api.remuneration;

import java.time.LocalDate;
import java.math.BigDecimal;

import com.integrationsi.salaries.api.common.CodeLibelle;

public record RemunerationDto(
        Long id,
        Long salarieId,
        CodeLibelle typeRemuneration,
        LocalDate dateDebut,
        LocalDate dateFin,
        BigDecimal montant,
        CodeLibelle devise,
        CodeLibelle periodicite
) {
}
