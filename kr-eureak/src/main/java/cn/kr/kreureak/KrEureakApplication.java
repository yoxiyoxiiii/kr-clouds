package cn.kr.kreureak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 84681
 */
@EnableEurekaServer
@SpringBootApplication
public class KrEureakApplication {

	public static void main(String[] args) {
		SpringApplication.run(KrEureakApplication.class, args);
	}
}
