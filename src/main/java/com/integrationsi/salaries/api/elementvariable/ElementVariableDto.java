package com.integrationsi.salaries.api.elementvariable;

import java.time.LocalDate;
import java.math.BigDecimal;

import com.integrationsi.salaries.api.common.CodeLibelle;

public record ElementVariableDto(
        Long id,
        Long salarieId,
        CodeLibelle typeElement,
        LocalDate periode,
        BigDecimal quantite,
        BigDecimal taux,
        BigDecimal montant,
        String commentaire
) {
}
