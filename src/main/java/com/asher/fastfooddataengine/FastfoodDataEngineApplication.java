package com.asher.fastfooddataengine;

import com.asher.fastfooddataengine.mappers.UserProfileMapper;
import com.asher.fastfooddataengine.model.UserProfile;
import com.asher.fastfooddataengine.service.UserProfileService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.spring.boot.autoconfigure.DubboAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import java.rmi.RemoteException;

/**
 * @author ：Asher
 */
@SpringBootApplication
@Slf4j
@Import(DubboAutoConfiguration.class)
public class FastfoodDataEngineApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(FastfoodDataEngineApplication.class, args);
        UserProfileMapper bean1 = run.getBean(UserProfileMapper.class);
        System.out.println(bean1);
        UserProfileService bean = run.getBean(UserProfileService.class);
        try {
            UserProfile user = bean.getUserByUserId(1L, null);
            System.out.println(user);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }

    }

}
