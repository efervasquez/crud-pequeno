package com.cruddata1.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name = "actividades")
public class Actividades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long item;

    @Column(nullable = false, length = 5)
    private Long anio;

    @Column(nullable = false, length = 10)
    private String mes;

    @CreatedDate
    @Column(name = "fecha_actividad", updatable = false)
    private LocalDateTime fechaactividad;

    @Column(name = "titulo_actividad", nullable = false, updatable = false , length = 500)
    private String tituloactividad;

    @Column(name = "definicion_actividad", nullable = false, updatable = false , length = 500)
    private String definicionactividad;

    @Column(name = "hora", nullable = false, updatable = false , length = 50)
    private String hora;

    @Column(name = "lugar_actividad", nullable = false, updatable = false , length = 500)
    private String lugaractividad;

    @Column(name = "direccion_actividad", nullable = false, updatable = false , length = 500)
    private String direccionactividad;

    @Column(nullable = false, length = 50)
    private String programa;






}
