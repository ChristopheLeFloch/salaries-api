package com.integrationsi.salaries.api.societe;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

@HttpExchange("/societes")
public interface SocieteClient {

    @GetExchange
    List<SocieteDto> findAll();

    @GetExchange("/{id}")
    SocieteDto findById(@PathVariable Long id);

    @PostExchange
    SocieteDto create(@RequestBody SocieteDto societe);

    @PutExchange("/{id}")
    SocieteDto update(@PathVariable Long id, @RequestBody SocieteDto societe);

    @DeleteExchange("/{id}")
    void delete(@PathVariable Long id);
}
