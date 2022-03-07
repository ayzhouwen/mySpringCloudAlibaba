package com.jyzn.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 * 
 * @author jyzn
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class JyznGatewayApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(JyznGatewayApplication.class, args);
        System.out.println("网关启动成功");
    }
}
