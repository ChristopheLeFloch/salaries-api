package com.integrationsi.salaries.api.direction;


import com.integrationsi.salaries.api.common.CodeLibelle;

public record DirectionDto(
        Long id,
        String code,
        String libelle,
        CodeLibelle societe
) {
}
