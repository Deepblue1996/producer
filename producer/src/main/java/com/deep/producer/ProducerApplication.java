package com.deep.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 生产者
 */
@SpringBootApplication
@EnableEurekaClient
public class ProducerApplication {

    /**
     * Netty 集群 建议使用redis HashMap解决
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

}
