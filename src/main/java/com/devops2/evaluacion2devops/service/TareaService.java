package com.devops2.evaluacion2devops.service;

import com.devops2.evaluacion2devops.entity.Tarea;
import com.devops2.evaluacion2devops.repository.TareaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {

    private final TareaRepository repository;

    public TareaService(TareaRepository repository) {
        this.repository = repository;
    }

    public List<Tarea> listar() {
        return repository.findAll();
    }

    public Tarea guardar(Tarea tarea) {
        return repository.save(tarea);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}