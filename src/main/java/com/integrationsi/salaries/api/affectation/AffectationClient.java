package com.integrationsi.salaries.api.affectation;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

@HttpExchange("/affectations")
public interface AffectationClient {

    @GetExchange
    List<AffectationDto> findAll();

    @GetExchange("/{id}")
    AffectationDto findById(@PathVariable Long id);

    @GetExchange
    List<AffectationDto> findBySalarieId(@RequestParam("salarieId") Long salarieId);

    @PostExchange
    AffectationDto create(@RequestBody AffectationDto affectation);

    @PutExchange("/{id}")
    AffectationDto update(@PathVariable Long id, @RequestBody AffectationDto affectation);

    @DeleteExchange("/{id}")
    void delete(@PathVariable Long id);
}
