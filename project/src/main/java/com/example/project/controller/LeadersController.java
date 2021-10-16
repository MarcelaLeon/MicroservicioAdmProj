package com.example.project.controller;

import com.example.project.entity.Leaders;
import com.example.project.service.LeadersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leaders")
public class LeadersController {

    private LeadersService leadersService;

    public LeadersController(LeadersService leadersService) {
        this.leadersService = leadersService;
    }

    @PostMapping("/registrar")
    public Leaders registrar(@RequestBody Leaders leader){
        return leadersService.agregarLeader(leader);
    }

    @GetMapping("/ver/{id}")
    public Leaders ver(@PathVariable Long id){
        return leadersService.verLeader(id);
    }

    @GetMapping
    public List<Leaders> listar(){
        return leadersService.listarLeaders();
    }

    @PutMapping("/actualizar")
    public Leaders actualizarLeader(@RequestBody Leaders leader){
        return leadersService.actualizarLeader(leader);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarLeader(@PathVariable Long id){
        leadersService.eliminarLeader(id);
    }
}
