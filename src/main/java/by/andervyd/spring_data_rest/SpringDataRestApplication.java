package by.andervyd.spring_data_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataRestApplication.class, args);

/* Spring Boot Actuator (endpoints)
        /actuator/health
        /actuator/info
        /actuator/beans
        /actuator/mappings
*/

    }
}
