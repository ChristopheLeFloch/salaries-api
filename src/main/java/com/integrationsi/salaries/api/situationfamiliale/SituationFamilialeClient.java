package com.integrationsi.salaries.api.situationfamiliale;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

@HttpExchange("/situationfamiliales")
public interface SituationFamilialeClient {

    @GetExchange
    List<SituationFamilialeDto> findAll();

    @GetExchange("/{id}")
    SituationFamilialeDto findById(@PathVariable Long id);

    @GetExchange
    List<SituationFamilialeDto> findBySalarieId(@RequestParam("salarieId") Long salarieId);

    @PostExchange
    SituationFamilialeDto create(@RequestBody SituationFamilialeDto situationfamiliale);

    @PutExchange("/{id}")
    SituationFamilialeDto update(@PathVariable Long id, @RequestBody SituationFamilialeDto situationfamiliale);

    @DeleteExchange("/{id}")
    void delete(@PathVariable Long id);
}
