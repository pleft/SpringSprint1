package com.pleft.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    @Bean
    MessageService mockMessageService() {
        return new MessageServiceImpl();
    }

  public static void main(String[] args) {
      String type = args.length>0?args[0]:null;
      ApplicationContext context = null;
      if("ANNOTATION".equals(type)) {
          logger.debug("loading annotation config application context");
          context = new AnnotationConfigApplicationContext(Application.class);
      } else {
          logger.debug("loading classpath xml config application context");
          context = new ClassPathXmlApplicationContext("spring.xml", Application.class);
      }

      MessagePrinter printer = context.getBean(MessagePrinter.class);
      printer.printMessage();
  }
}