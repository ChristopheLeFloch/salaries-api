package com.integrationsi.salaries.api.nomenclature;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

@HttpExchange("/nomenclatures")
public interface NomenclatureClient {

    @GetExchange
    List<NomenclatureDto> findAll();

    @GetExchange("/{id}")
    NomenclatureDto findById(@PathVariable Long id);

    @GetExchange
    List<NomenclatureDto> findByType(@RequestParam("type") String type);

    @PostExchange
    NomenclatureDto create(@RequestBody NomenclatureDto nomenclature);

    @PutExchange("/{id}")
    NomenclatureDto update(@PathVariable Long id, @RequestBody NomenclatureDto nomenclature);

    @DeleteExchange("/{id}")
    void delete(@PathVariable Long id);
}
