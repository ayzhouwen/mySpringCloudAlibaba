package com.jyzn.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.jyzn.common.security.annotation.EnableCustomConfig;
import com.jyzn.common.security.annotation.EnableRyFeignClients;

/**
 * 系统模块
 * 
 * @author jyzn
 */
@EnableCustomConfig
@EnableRyFeignClients
@SpringBootApplication
public class JyznSystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(JyznSystemApplication.class, args);
        System.out.println("系统模块启动成功");
    }
}
