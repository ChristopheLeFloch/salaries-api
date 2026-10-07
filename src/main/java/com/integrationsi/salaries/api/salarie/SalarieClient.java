package com.integrationsi.salaries.api.salarie;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

@HttpExchange("/salaries")
public interface SalarieClient {

    @GetExchange
    List<SalarieDto> findAll();

    @GetExchange("/{id}")
    SalarieDto findById(@PathVariable Long id);

    @PostExchange
    SalarieDto create(@RequestBody SalarieDto salarie);

    @PutExchange("/{id}")
    SalarieDto update(@PathVariable Long id, @RequestBody SalarieDto salarie);

    @DeleteExchange("/{id}")
    void delete(@PathVariable Long id);
}
