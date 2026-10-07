package com.integrationsi.salaries.api.direction;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

@HttpExchange("/directions")
public interface DirectionClient {

    @GetExchange
    List<DirectionDto> findAll();

    @GetExchange("/{id}")
    DirectionDto findById(@PathVariable Long id);

    @GetExchange
    List<DirectionDto> findBySociete(@RequestParam("societe") String societe);

    @PostExchange
    DirectionDto create(@RequestBody DirectionDto direction);

    @PutExchange("/{id}")
    DirectionDto update(@PathVariable Long id, @RequestBody DirectionDto direction);

    @DeleteExchange("/{id}")
    void delete(@PathVariable Long id);
}
