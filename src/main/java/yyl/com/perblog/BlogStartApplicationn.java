package yyl.com.perblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BlogStartApplicationn implements WebMvcConfigurer{

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/lib/**").addResourceLocations();
//    }




    public static void main(String[] args) {
        SpringApplication.run(BlogStartApplicationn.class, args);
    }

}
