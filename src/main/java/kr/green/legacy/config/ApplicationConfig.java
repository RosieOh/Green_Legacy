package kr.green.legacy.config;

import kr.green.legacy.repository.TestRepository;
import kr.green.legacy.repository.TestRepositoryImpl;
import kr.green.legacy.service.TestService;
import kr.green.legacy.service.TestServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.green.legacy")
public class ApplicationConfig {
    @Bean
    public TestService testService3(){
        return new TestServiceImpl();
    }

    @Bean
    public TestRepository testRepository3(){
        return new TestRepositoryImpl();
    }
}
