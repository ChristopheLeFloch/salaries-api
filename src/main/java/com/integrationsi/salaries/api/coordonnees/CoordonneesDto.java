package com.integrationsi.salaries.api.coordonnees;


import com.integrationsi.salaries.api.common.CodeLibelle;

public record CoordonneesDto(
        Long id,
        Long salarieId,
        String adresse1,
        String adresse2,
        String codePostal,
        String ville,
        CodeLibelle pays,
        String telephone,
        String emailPersonnel
) {
}
