package com.devops2.evaluacion2devops.controller;

import com.devops2.evaluacion2devops.entity.Tarea;
import com.devops2.evaluacion2devops.service.TareaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")
@CrossOrigin("*")
public class TareaController {

    private final TareaService service;

    public TareaController(TareaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Tarea> listar() {
        return service.listar();
    }

    @PostMapping
    public Tarea guardar(@RequestBody Tarea tarea) {
        return service.guardar(tarea);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}