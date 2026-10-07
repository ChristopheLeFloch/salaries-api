package com.integrationsi.salaries.api.common;

/**
 * Valeur codée exposée par l'API : le code stocké et son libellé
 * (nomenclature ou entité référencée comme Societe, Etablissement...).
 * En entrée, seul le code est pris en compte.
 */
public record CodeLibelle(String code, String libelle) {
}
