package com.matias.java.back.end;

import com.matias.java.back.end.dto.UserDTO;
import com.matias.java.back.end.service.UserService;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/")
    public List<UserDTO> getUsers() {
        return userService.getAll();
    }

    @GetMapping("/user/{id}")
    public UserDTO findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping("/user")
    public UserDTO newUser(@RequestBody UserDTO userDTO) {
        return userService.save(userDTO);
    }

    @GetMapping("/user/cpf/{cpf}")
    public UserDTO findByCpf(@PathVariable String cpf) {
        return userService.findByCpf(cpf);
    }

    @DeleteMapping("/user/{id}")
    public UserDTO delete(@PathVariable Long id) {
        return userService.delete(id);
    }

    @GetMapping("/user/search")
    public List<UserDTO> queryByName(
            @RequestParam(name = "nome", required = true) String nome) {
        return userService.queryByName(nome);
    }
}