import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @RestController
    public class WelcomeController {
        @GetMapping("/")
        public String welcome() {
            return "<h1>Welcome to Kanykeis E-commerce Website</h1>" +
                   "<img src='/welcome.jpg' alt='Welcome Image'>";
        }
    }
}
