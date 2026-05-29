package com.wintux.computadorita.Controllers;

import com.wintux.computadorita.Tools.Calculadora;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculadoraController {

    @PostMapping("/expresion")
    public String calcularInfix(@RequestBody String infix) {
        String postfix = Calculadora.convertirApostfix(infix);
        String resultado = Calculadora.resolverExpresionPostfix(postfix);
        return resultado;
    }
}