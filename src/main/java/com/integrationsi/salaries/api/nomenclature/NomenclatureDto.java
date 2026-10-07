package com.integrationsi.salaries.api.nomenclature;

import java.time.LocalDate;

public record NomenclatureDto(
        Long id,
        String type,
        String code,
        String libelle,
        LocalDate dateDebut,
        LocalDate dateFin
) {
}
