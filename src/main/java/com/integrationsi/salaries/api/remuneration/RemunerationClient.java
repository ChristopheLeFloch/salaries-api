package com.integrationsi.salaries.api.remuneration;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

@HttpExchange("/remunerations")
public interface RemunerationClient {

    @GetExchange
    List<RemunerationDto> findAll();

    @GetExchange("/{id}")
    RemunerationDto findById(@PathVariable Long id);

    @GetExchange
    List<RemunerationDto> findBySalarieId(@RequestParam("salarieId") Long salarieId);

    @PostExchange
    RemunerationDto create(@RequestBody RemunerationDto remuneration);

    @PutExchange("/{id}")
    RemunerationDto update(@PathVariable Long id, @RequestBody RemunerationDto remuneration);

    @DeleteExchange("/{id}")
    void delete(@PathVariable Long id);
}
