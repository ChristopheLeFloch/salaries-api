package com.integrationsi.salaries.api.remuneration;

import java.time.LocalDate;
import java.math.BigDecimal;

import com.integrationsi.salaries.api.common.CodeLibelle;

public record RemunerationDto(
        Long id,
        Long salarieId,
        LocalDate dateDebut,
        LocalDate dateFin,
        BigDecimal montantMensuel,
        CodeLibelle devise
) {
}
