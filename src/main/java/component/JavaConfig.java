package component;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ComponentScan(value = {"Dao","server"})
@Configuration
@ImportResource("classpath:application.xml")
public class JavaConfig {
}
