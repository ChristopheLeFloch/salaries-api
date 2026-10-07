package com.integrationsi.salaries.api.salarie;

import java.time.LocalDate;

public record SalarieDto(
        Long id,
        String matricule,
        String nom,
        String nomNaissance,
        String prenom,
        LocalDate dateNaissance,
        String lieuNaissance,
        LocalDate dateEntree,
        LocalDate dateSortie
) {
}
