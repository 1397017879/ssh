package cn;

import cn.zyf.domain.User;
import cn.zyf.dubboservice.IUserServiec;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by ZYF_JOKER on 2018/1/29.
 */
public class Consumer {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        IUserServiec demoService = (IUserServiec) ctx.getBean("iUserServiec");
        System.out.print(demoService);

    }
}
