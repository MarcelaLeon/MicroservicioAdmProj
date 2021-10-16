package com.example.project.service;

import com.example.project.entity.User;
import com.example.project.repository.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User agregarUser(User user){
        return userRepository.save(user);
    }

    public User verUser(Long id){
        return userRepository.findById(id).get();
    }

    public List<User> listarUsers(){
        return userRepository.findAll();
    }

    public User actualizarUser(User user) {
        if (userRepository.findById(user.getId()).isPresent()) {

            User userParcial = userRepository.findById(user.getId()).get();
            userParcial.setName(user.getName());
            userParcial.setEmail(user.getEmail());
            userParcial.setPassword(user.getPassword());
            userParcial.setRole(user.getRole());

            return userRepository.save(user);

        } else {
            return null;
        }
    }

    public void eliminarUser(Long id){
        userRepository.deleteById(id);
    }

    public User verPorNickName(String nickName){
        return userRepository.findByNickName(nickName);
    }

}
