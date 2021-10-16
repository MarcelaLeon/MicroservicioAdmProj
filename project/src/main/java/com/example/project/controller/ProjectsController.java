package com.example.project.controller;

import com.example.project.entity.Projects;
import com.example.project.service.ProjectsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectsController {
    private ProjectsService projectsService;

    public ProjectsController(ProjectsService projectsService) {
        this.projectsService = projectsService;
    }

    @PostMapping("/registrar")
    public Projects registrar(@RequestBody Projects projects){
        return projectsService.agregarProjects(projects);
    }

    @GetMapping("/ver/{id}")
    public Projects ver(@PathVariable Long id){
        return projectsService.verProjects(id);
    }

    @GetMapping
    public List<Projects> listar(){
        return projectsService.listarProjects();
    }

    @PutMapping("/actualizar")
    public Projects actualizarProject(@RequestBody Projects projects){
        return projectsService.actualizarProjects(projects);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarProject(@PathVariable Long id){
        projectsService.
                eliminarProjects(id);
    }
}
