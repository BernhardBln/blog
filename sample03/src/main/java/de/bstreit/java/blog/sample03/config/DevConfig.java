package de.bstreit.java.blog.sample03.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(AbstractConfig.class)
public class DevConfig {


}
