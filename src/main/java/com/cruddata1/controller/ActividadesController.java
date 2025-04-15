package com.cruddata1.controller;

import com.cruddata1.entity.Actividades;
import com.cruddata1.service.ActividadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/actividades")
public class ActividadesController {

    @Autowired
    private ActividadesService actividadesService;

    @GetMapping
    public List<Actividades> getall() {
        return actividadesService.getallActividades();
    }


    @GetMapping("/{actividadid}")
    public Optional<Actividades> getById(@PathVariable("actividadid") Long actividadid) {
        return actividadesService.getActividadesById(actividadid);
    }

    @PostMapping
    public void saveUpdateactividades(@RequestBody Actividades actividades) {
        actividadesService.saveOrUpdate(actividades);
    }

    @DeleteMapping("/{actividadid}")
    public void deleteactividad(@PathVariable("actividadid") Long actividadid) {
        actividadesService.delete(actividadid);
    }

}
