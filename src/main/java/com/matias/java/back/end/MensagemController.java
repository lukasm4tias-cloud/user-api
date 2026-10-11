
package com.matias.java.back.end;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MensagemController {
    
    @GetMapping("/mensagem")
    public String getMensagem(){
        return "Minha primeira API Spring Boot";
    }
}
