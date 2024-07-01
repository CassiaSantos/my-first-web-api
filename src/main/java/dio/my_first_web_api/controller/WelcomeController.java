package dio.my_first_web_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController //transforma a classe em um componente REST --> alguns de seus métodos serão recursos HTTP;
public class WelcomeController {
    //@GetMapping //este método é mapeado e informado que é do tipo GET
    public String welcomeControler(){
        return "Welcome to my first Spring Boot Web API!";
    }
}
