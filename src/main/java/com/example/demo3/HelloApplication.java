import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }

    @PostMapping("/greet")
    public String greet(@RequestBody String name) {
        return "Hello, " + name + "!";
    }
}
