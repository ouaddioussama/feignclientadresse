package project.gate.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.gate.model.Person;

@FeignClient(name = "person-service", url = "http://localhost:8080", path = "/person")
public interface PersonClient {

    @RequestMapping(method = RequestMethod.GET, value = "/data")
    public Person getPerson();


    @RequestMapping(method = RequestMethod.POST, value = "/postperson")
    public Person postPerson(Person person);
}
