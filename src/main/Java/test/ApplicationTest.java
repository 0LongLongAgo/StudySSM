package test;

import com.lq.play.model.User;
import com.lq.play.model.UserMeta;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by liuqun on 2017/7/23.
 */
public class ApplicationTest {


    public static void main(String[] args) throws Exception {

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/spring/spring-servlet.xml");
//        User user = applicationContext.getBean("user", User.class);
//        System.out.println(user.toString());

        ApplicationContext applicationContext1 = new FileSystemXmlApplicationContext("classpath:config/spring/spring-servlet.xml");
        UserMeta userMeta = applicationContext1.getBean("userMeta", UserMeta.class);
        System.out.println(userMeta.toString());


    }
}
