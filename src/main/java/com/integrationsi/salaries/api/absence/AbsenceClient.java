package com.integrationsi.salaries.api.absence;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

@HttpExchange("/absences")
public interface AbsenceClient {

    @GetExchange
    List<AbsenceDto> findAll();

    @GetExchange("/{id}")
    AbsenceDto findById(@PathVariable Long id);

    @GetExchange
    List<AbsenceDto> findBySalarieId(@RequestParam("salarieId") Long salarieId);

    @PostExchange
    AbsenceDto create(@RequestBody AbsenceDto absence);

    @PutExchange("/{id}")
    AbsenceDto update(@PathVariable Long id, @RequestBody AbsenceDto absence);

    @DeleteExchange("/{id}")
    void delete(@PathVariable Long id);
}
