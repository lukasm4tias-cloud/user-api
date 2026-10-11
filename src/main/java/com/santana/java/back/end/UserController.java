package com.santana.java.back.end;

import com.santana.java.back.end.dto.UserDTO;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    public static List<UserDTO> usuarios = new ArrayList<>();

    @PostConstruct
    public void initiateList() {

        UserDTO userDTO = new UserDTO();
        userDTO.setNome("Lukas");
        userDTO.setCpf("123456789");
        userDTO.setEndereco("Rua dos Bobos");
        userDTO.setEmail("lukas@bobo.com.br");
        userDTO.setTelefone("99-9999-9999");
        userDTO.setDataCadastro(new Date());

        UserDTO userDTO2 = new UserDTO();
        userDTO2.setNome("MARIA");
        userDTO2.setCpf("123456789");
        userDTO2.setEndereco("Rua b");
        userDTO2.setEmail("maria@b.com.br");
        userDTO2.setTelefone("99-9999-9999");
        userDTO2.setDataCadastro(new Date());

        UserDTO userDTO3 = new UserDTO();
        userDTO3.setNome("cleo");
        userDTO3.setCpf("12389");
        userDTO3.setEndereco("Rua c");
        userDTO3.setEmail("cleo@bbc.com.br");
        userDTO3.setTelefone("99-9999-9999");
        userDTO3.setDataCadastro(new Date());

        usuarios.add(userDTO);
        usuarios.add(userDTO2);
        usuarios.add(userDTO3);

    }
    
    

    @GetMapping("/users/{cpf}")
    public UserDTO getUsersFiltro(@PathVariable String cpf) {
        for (UserDTO userFilter : usuarios) {
            if (userFilter.getCpf().equals(cpf)) {
                return userFilter;
            }
        }
        return null;
    }

    @PostMapping("/newUser")
    public UserDTO inserir(@RequestBody UserDTO userDTO) {
        userDTO.setDataCadastro(new Date());
        usuarios.add(userDTO);
        return userDTO;
    }

    @DeleteMapping("/user/{cpf}")
    public boolean remover(@PathVariable String cpf) {
        for (UserDTO userFilter : usuarios) {
            if (userFilter.getCpf().equals(cpf)) {
                usuarios.remove(userFilter);
                return true;
            }
        }
        return false;

    }
}
