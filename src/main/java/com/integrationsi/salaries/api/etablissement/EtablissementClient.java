package com.integrationsi.salaries.api.etablissement;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

@HttpExchange("/etablissements")
public interface EtablissementClient {

    @GetExchange
    List<EtablissementDto> findAll();

    @GetExchange("/{id}")
    EtablissementDto findById(@PathVariable Long id);

    @GetExchange
    List<EtablissementDto> findBySociete(@RequestParam("societe") String societe);

    @PostExchange
    EtablissementDto create(@RequestBody EtablissementDto etablissement);

    @PutExchange("/{id}")
    EtablissementDto update(@PathVariable Long id, @RequestBody EtablissementDto etablissement);

    @DeleteExchange("/{id}")
    void delete(@PathVariable Long id);
}
