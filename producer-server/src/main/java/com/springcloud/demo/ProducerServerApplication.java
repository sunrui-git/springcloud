package com.springcloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description 消费者启动类
 * @author sunrui
 * @date 10:22 2019/9/25
 */
@SpringBootApplication
@EnableEurekaClient
public class ProducerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerServerApplication.class, args);
	}

}
