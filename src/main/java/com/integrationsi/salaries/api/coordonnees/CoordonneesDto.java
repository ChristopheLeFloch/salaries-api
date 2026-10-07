package com.integrationsi.salaries.api.coordonnees;


public record CoordonneesDto(
        Long id,
        Long salarieId,
        String adresse1,
        String adresse2,
        String codePostal,
        String ville,
        String pays,
        String telephone,
        String emailPersonnel
) {
}
