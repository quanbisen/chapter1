import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author super lollipop
 * @date 2019/10/19
 */
public class JUnitTest {

    @Test
    public void saySomethingTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao",UserDao.class);
        userDao.saySomething();
    }

    @Test
    public void dependencyInjectionTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = applicationContext.getBean("userService",UserService.class);
        userService.saySomething();
    }
}
