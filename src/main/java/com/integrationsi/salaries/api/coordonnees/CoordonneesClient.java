package com.integrationsi.salaries.api.coordonnees;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

@HttpExchange("/coordonneess")
public interface CoordonneesClient {

    @GetExchange
    List<CoordonneesDto> findAll();

    @GetExchange("/{id}")
    CoordonneesDto findById(@PathVariable Long id);

    @GetExchange
    List<CoordonneesDto> findBySalarieId(@RequestParam("salarieId") Long salarieId);

    @PostExchange
    CoordonneesDto create(@RequestBody CoordonneesDto coordonnees);

    @PutExchange("/{id}")
    CoordonneesDto update(@PathVariable Long id, @RequestBody CoordonneesDto coordonnees);

    @DeleteExchange("/{id}")
    void delete(@PathVariable Long id);
}
