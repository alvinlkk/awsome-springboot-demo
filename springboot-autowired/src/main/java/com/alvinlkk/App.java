package com.alvinlkk;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.alvinlkk.scope.PrototypeBean;
import com.alvinlkk.scope.SingletonBean;
import com.alvinlkk.scope.SingletonBean1;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = "com.alvinlkk")
public class App {

    public static void main( String[] args ) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

        Person personBean = context.getBean(Person.class);
        System.out.println(personBean);

//
//        PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
//        System.out.println(prototypeBean1);
//        PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
//        System.out.println(prototypeBean2);
//        System.out.println(prototypeBean1 == prototypeBean2);

//        System.out.println("执行 SingletonBean 测试：");
//        SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
//        System.out.println(singletonBean1);
//        SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
//        System.out.println(singletonBean2);
//        System.out.println(singletonBean1 == singletonBean1);
//        context.close();

//        SingletonBean1 singletonBean1 = context.getBean(SingletonBean1.class);
//        for (int i = 0; i < 5; i++) {
//            singletonBean1.callProtypeBeanPrint();
//        }
    }
}
