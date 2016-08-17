import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by akshay.kumar1 on 17/08/16.
 */
public class Main {

    public static void main(String[] args) {
        String confFile = "classpath:applicationContext.xml";
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
        Payment payment = (Payment) context.getBean("payment");
        System.out.println(payment.toString());

    }
}
