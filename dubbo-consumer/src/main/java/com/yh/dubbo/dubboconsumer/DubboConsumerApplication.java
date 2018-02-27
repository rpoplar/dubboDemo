package com.yh.dubbo.dubboconsumer;

import com.yh.dubbo.dubboapi.demoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DubboConsumerApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DubboConsumerApplication.class, args);
		//测试常规服务
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("consumer.xml");
		context.start();
		System.out.println("consumer start");
		demoService demoService = context.getBean(demoService.class);
		System.out.println("consumer");
		System.out.println(demoService.sayHello(1L));
	}
}
