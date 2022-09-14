package git.test.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String main(){


        return "main";
    }

    @GetMapping("/dev")
    public String dev(){
        return "dev";
    }

}
