package com.example.project.service;


import com.example.project.entity.Leaders;
import com.example.project.entity.User;
import com.example.project.repository.ILeadersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeadersService {

    private ILeadersRepository leadersRepository;

    public LeadersService(ILeadersRepository leadersRepository) {
        this.leadersRepository = leadersRepository;
    }

    public Leaders agregarLeader(Leaders leader){
        return leadersRepository.save(leader);
    }

    public Leaders verLeader(Long id){
        return leadersRepository.findById(id).get();
    }

    public List<Leaders> listarLeaders(){
        return leadersRepository.findAll();
    }

    public Leaders actualizarLeader(Leaders leader) {
        if (leadersRepository.findById(leader.getId()).isPresent()) {

            Leaders leaderParcial = leadersRepository.findById(leader.getId()).get();
            leaderParcial.setName(leader.getName());
            leaderParcial.setMovil(leader.getMovil());
            leaderParcial.setEmail(leader.getEmail());
            leaderParcial.setTime(leader.getTime());

            return leadersRepository.save(leader);

        } else {
            return null;
        }
    }

    public void eliminarLeader(Long id){
        leadersRepository.deleteById(id);
    }

}
