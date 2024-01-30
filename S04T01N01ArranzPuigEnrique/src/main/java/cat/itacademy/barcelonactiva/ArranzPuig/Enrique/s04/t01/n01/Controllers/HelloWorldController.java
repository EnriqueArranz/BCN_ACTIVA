package cat.itacademy.barcelonactiva.ArranzPuig.Enrique.s04.t01.n01.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @GetMapping("/saluda")
    public String saluda(@RequestParam(name = "name", defaultValue = "UNKNOWN") String name) {
        return "Hola, " + name + ". Estàs executant un projecte Maven";
    }

    @GetMapping("/saluda2/{name}")
    public String saluda2(@PathVariable(name = "name") String nom) {
        return "Hola, " + nom + ". Estàs executant un projecte Maven";
    }
}
