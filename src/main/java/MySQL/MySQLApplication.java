package MySQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class MySQLApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(MySQLApplication.class, args);
    }
}
