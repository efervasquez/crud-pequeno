package com.cruddata1.service;

import com.cruddata1.entity.Actividades;
import com.cruddata1.repository.ActividadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ActividadesService {
    @Autowired
    ActividadesRepository actividadesrepository;

    public List<Actividades> getallActividades() {
        return actividadesrepository.findAll();
    }


    public Optional<Actividades> getActividadesById(Long idActividades) {
        return actividadesrepository.findById(idActividades);
    }

    public void saveOrUpdate(Actividades actividades) {
        actividades.setFechaactividad(LocalDateTime.now());
        actividadesrepository.save(actividades);
    }

    public void delete(Long id) {
        actividadesrepository.deleteById(id);
    }

}
