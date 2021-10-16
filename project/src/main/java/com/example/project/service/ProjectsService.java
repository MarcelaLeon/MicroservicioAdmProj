package com.example.project.service;

import com.example.project.entity.Leaders;
import com.example.project.entity.Projects;
import com.example.project.entity.User;
import com.example.project.repository.IProjectsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectsService {
    private final IProjectsRepository projectsRepository;

    public ProjectsService(IProjectsRepository userRepository) {
        this.projectsRepository = userRepository;
    }

    public Projects agregarProjects(Projects user){
        return projectsRepository.save(user);
    }

    public Projects verProjects(Long id){
        return projectsRepository.findById(id).get();
    }

    public List<Projects> listarProjects(){
        return projectsRepository.findAll();
    }

    public Projects actualizarProjects(Projects projects){
        if (projectsRepository.findById(projects.getId()).isPresent()){

            Projects userParcial = projectsRepository.findById(projects.getId()).get();
            userParcial.setName(projects.getName());
            userParcial.setDescription(projects.getDescription());
            userParcial.setBudget(projects.getBudget());
            userParcial.setDinit(projects.getDinit());
            userParcial.setDfin(projects.getDfin());
            userParcial.setLeader(projects.getLeader());
            userParcial.setStudents(projects.getStudents());
            userParcial.setActive(projects.getActive());
            userParcial.setStatus(projects.getStatus());
            userParcial.setAdvances(projects.getAdvances());

            return projectsRepository.save(projects);

        }else {
            return null;
        }
    }

    public void eliminarProjects(Long id){
        projectsRepository.deleteById(id);
    }


}
