package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication		//启用Feign时必须使用Cloud
@EnableFeignClients			//标识feign程序
public class FeignRunApp {
	public static void main(String[] args) {
		SpringApplication.run(FeignRunApp.class, args);
	}
}
