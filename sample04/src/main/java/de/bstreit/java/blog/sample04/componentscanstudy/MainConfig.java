package de.bstreit.java.blog.sample04.componentscanstudy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackageClasses = Starter.class)
public class MainConfig {

}
