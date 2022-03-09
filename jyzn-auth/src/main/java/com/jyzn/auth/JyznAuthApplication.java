package com.jyzn.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import com.jyzn.common.security.annotation.EnableRyFeignClients;

/**
 * 认证授权中心
 * 
 * @author jyzn
 */
@EnableRyFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class JyznAuthApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(JyznAuthApplication.class, args);
        System.out.println("认证授权中心启动成功");
    }
}
