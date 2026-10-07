package com.integrationsi.salaries.api.contrat;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

@HttpExchange("/contrats")
public interface ContratClient {

    @GetExchange
    List<ContratDto> findAll();

    @GetExchange("/{id}")
    ContratDto findById(@PathVariable Long id);

    @GetExchange
    List<ContratDto> findBySalarieId(@RequestParam("salarieId") Long salarieId);

    @PostExchange
    ContratDto create(@RequestBody ContratDto contrat);

    @PutExchange("/{id}")
    ContratDto update(@PathVariable Long id, @RequestBody ContratDto contrat);

    @DeleteExchange("/{id}")
    void delete(@PathVariable Long id);
}
