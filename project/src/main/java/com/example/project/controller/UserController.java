package com.example.project.controller;

import com.example.project.entity.User;
import com.example.project.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/registrar")
    public User registrar(@RequestBody User user){
        return userService.agregarUser(user);
    }

    @GetMapping("/ver/{id}")
    public User ver(@PathVariable Long id){
        return userService.verUser(id);
    }
    @GetMapping
    public List<User> listar(){
        return userService.listarUsers();
    }

    @PutMapping("/actualizar")
    public User actualizarUsuario(@RequestBody User user){
        return userService.actualizarUser(user);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarUsuario(@PathVariable Long id){
        userService.eliminarUser(id);
    }

    @GetMapping("/buscar/{nickName}")
    public User ver(@PathVariable String nickName){
        return userService.verPorNickName(nickName);
    }


}
