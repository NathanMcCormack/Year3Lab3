package ie.atu.lab3;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @PostMapping("/person/createPerson")
    public String addPerson(@RequestBody @Valid Person personRequest){
        return "Details added";
    }
}
