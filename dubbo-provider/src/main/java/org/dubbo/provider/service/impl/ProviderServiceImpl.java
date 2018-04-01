package org.dubbo.provider.service.impl;

import org.dubbo.provider.service.ProviderService;
import org.springframework.stereotype.Service;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class ProviderServiceImpl implements ProviderService {

	public void sayHello(String name) {
		System.out.println("Hello " + name + "!");
	}

}
