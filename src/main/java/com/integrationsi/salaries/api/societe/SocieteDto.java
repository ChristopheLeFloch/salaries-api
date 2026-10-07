package com.integrationsi.salaries.api.societe;


public record SocieteDto(
        Long id,
        String code,
        String libelle,
        String siren
) {
}
