package com.integrationsi.salaries.api.carriere;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

@HttpExchange("/carrieres")
public interface CarriereClient {

    @GetExchange
    List<CarriereDto> findAll();

    @GetExchange("/{id}")
    CarriereDto findById(@PathVariable Long id);

    @GetExchange
    List<CarriereDto> findBySalarieId(@RequestParam("salarieId") Long salarieId);

    @PostExchange
    CarriereDto create(@RequestBody CarriereDto carriere);

    @PutExchange("/{id}")
    CarriereDto update(@PathVariable Long id, @RequestBody CarriereDto carriere);

    @DeleteExchange("/{id}")
    void delete(@PathVariable Long id);
}
