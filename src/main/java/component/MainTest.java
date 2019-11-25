package component;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import server.DataBaseServer;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        DataBaseServer server = context.getBean(DataBaseServer.class);
        System.out.println(server.findById(234945));
    }
}
