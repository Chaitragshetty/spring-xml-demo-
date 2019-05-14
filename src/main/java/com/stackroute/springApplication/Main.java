package com.stackroute.springApplication;

import com.stackroute.springApplication.beans.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.beans.beancontext.BeanContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie3=(Movie)context.getBean("movie3");
        Movie movie1=(Movie)context.getBean("movie1");

        System.out.println(movie3.toString());
        System.out.println(movie1.toString());
        System.out.println(movie3==movie1);

//        Resource resource = new ClassPathResource("beans.xml");
//        BeanFactory beanFactory = new XmlBeanFactory(resource);

        //Lazy instantiation
//
//        Movie movie = (Movie) beanFactory.getBean("movie1");
//        System.out.println(movie.welcomeMsg());

//   //task1
//        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
//        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
//        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
//        Movie movie=(Movie) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movie1");
//
//        // Using XmlBeanFactory
//        Resource resource=new ClassPathResource("beans.xml");
//        BeanFactory beanFactory=new XmlBeanFactory(resource);
//        Movie movie1=(Movie)beanFactory.getBean("movie1");
//        System.out.println(movie1.toString());
//
//        //Using ApplicationContext
//        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//        Movie movie3=(Movie)context.getBean("movie3");
//        System.out.println(movie3.toString());
//
////        //Using Spring 3.2 BeanDefinitionRegistry and BeanDefinitionReader
////        BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
////        BeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(beanDefinitionRegistry);
////        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
////        Movie movie3=(Movie)((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movie3");
////        System.out.println(movie3.toString());
    }
    }

