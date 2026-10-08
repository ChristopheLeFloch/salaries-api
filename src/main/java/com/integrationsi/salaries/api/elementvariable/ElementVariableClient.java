package com.integrationsi.salaries.api.elementvariable;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

@HttpExchange("/elementvariables")
public interface ElementVariableClient {

    @GetExchange
    List<ElementVariableDto> findAll();

    @GetExchange("/{id}")
    ElementVariableDto findById(@PathVariable Long id);

    @GetExchange
    List<ElementVariableDto> findBySalarieId(@RequestParam("salarieId") Long salarieId);

    @PostExchange
    ElementVariableDto create(@RequestBody ElementVariableDto elementvariable);

    @PutExchange("/{id}")
    ElementVariableDto update(@PathVariable Long id, @RequestBody ElementVariableDto elementvariable);

    @DeleteExchange("/{id}")
    void delete(@PathVariable Long id);
}
