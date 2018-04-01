package org.dubbo.consumer;

import java.io.IOException;

import org.dubbo.provider.service.ProviderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-consumer.xml"});
		context.start();
		System.out.println("consumer server started.");
		ProviderService providerService = context.getBean(ProviderService.class);
		providerService.sayHello();
		System.in.read();
	}
}
