package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExamenController {
    private final ExamenService examenService;

    @PostMapping("/pedido")
    public Response<Examen> pedido(@RequestBody RequestExamen requestExamen){
        return this.examenService.pedido(requestExamen);
    }

    @GetMapping("/pedidosId")
    public Response<Examen> pedidosById(@RequestBody int id){
        return this.examenService.pedidosById(int id);
    }

    @GetMapping("pedidos_all") 
    public Response<Examen> pedidosAll(@RequestBody RequestExamen requestExamen){ //verificar al final parametro
        return this.examenService.pedidosAll(requestExamen);
    }

}