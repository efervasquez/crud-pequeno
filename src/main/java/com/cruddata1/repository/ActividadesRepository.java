package com.cruddata1.repository;


import com.cruddata1.entity.Actividades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActividadesRepository extends JpaRepository < Actividades, Long> {

}
