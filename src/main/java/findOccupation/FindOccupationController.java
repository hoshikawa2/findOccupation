package findOccupation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
public class FindOccupationController {

    @RequestMapping("/findOccupation")
    public String findOccupation(@RequestParam(value="name", defaultValue="World") String name) {
    	RestTemplate restTemplate = new RestTemplate();
    	
    	String url = System.getenv("OCCUPATION_URL");
    	String port = System.getenv("OCCUPATION_PORT");
    	
        Greeting greeting = restTemplate.getForObject(url + ":" + port + "/greeting?name=Cristiano", Greeting.class);
        return greeting.toString();
    }
}