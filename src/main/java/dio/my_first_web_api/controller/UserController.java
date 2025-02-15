package dio.my_first_web_api.controller;
import dio.my_first_web_api.model.User;
import dio.my_first_web_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Não aplicar regras de negócio no controller e sim na camada de serviço ou domínio da aplicação;
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping()
    public List<User> getUsers(){
        return repository.findAll();
    }
    @GetMapping("/{username}")
    public User getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody User usuario){
        repository.save(usuario);
    }

    @PutMapping()
    public void putUser(@RequestBody User usuario){
        repository.save(usuario);
    }
}
