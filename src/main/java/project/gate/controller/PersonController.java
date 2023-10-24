package project.gate.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.gate.feignclient.PersonClient;
import project.gate.model.Person;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonClient personClient;


    @GetMapping(path = "/data",produces = "application/json")
    public ResponseEntity<Person> getPerson(){

        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(personClient.getPerson());
    }

    @PostMapping(path = "/postperson",produces = "application/json")
    public ResponseEntity<Person> postPerson(@RequestBody Person person){

        Person personResponse=personClient.postPerson(person);

        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(personResponse);
    }





}
