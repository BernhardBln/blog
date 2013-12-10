package de.bstreit.java.blog.sample02.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import de.bstreit.java.blog.sample02.beans.BeansPackageMarkerClass;


@Configuration
@ComponentScan(basePackageClasses = BeansPackageMarkerClass.class)
public class Config {

}
