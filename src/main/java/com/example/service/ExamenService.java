package com.example.service;

public interface ExamenService {

    Response<Examen> pedido(RequestExamen requestExamen);
    Response<Examen> pedidosById(int id);
    Response<Examen> pedidosAll(RequestExamen requestExamen); //verificar al final parametro

}
