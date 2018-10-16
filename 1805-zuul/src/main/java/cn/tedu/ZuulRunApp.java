package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy			//启动断路器
@EnableEurekaClient
public class ZuulRunApp {
	public static void main(String[] args) {
		SpringApplication.run(ZuulRunApp.class, args);
	}
}
