
package com.demo.web;
import com.demo.dao.ClienteDao;
import java.util.ArrayList;
import com.demo.entidad.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j

public class Controles {
    @Autowired
 private ClienteDao clienteDao;
    @GetMapping("/")

        public  String iniciar(Model model) {
         var clientes= clienteDao.findAll();
         
            
            log.info("Ejecutando");
            
            model.addAttribute("clientes", clientes);
        return "index";
        
}
}
