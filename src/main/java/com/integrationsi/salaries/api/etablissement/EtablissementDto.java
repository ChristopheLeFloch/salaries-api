package com.integrationsi.salaries.api.etablissement;


import com.integrationsi.salaries.api.common.CodeLibelle;

public record EtablissementDto(
        Long id,
        String code,
        String libelle,
        String siret,
        CodeLibelle societe
) {
}
