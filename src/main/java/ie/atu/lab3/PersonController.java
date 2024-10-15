package ie.atu.lab3;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    List<Person> personList = new ArrayList<>();

    @GetMapping
    public List<Person> getAllPerson(){
        return personList;
    }

    @PostMapping("/createPerson")
    public String addPerson(@RequestBody @Valid Person personRequest){

        personList.add(personRequest);
        return "Details added";
    }
}
