package project.gate.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "address-service", url = "http://localhost:8080", path = "/address")
public interface AdresseClient {

    @RequestMapping(method = RequestMethod.GET, value = "/data")
    public String getAdress();
}
