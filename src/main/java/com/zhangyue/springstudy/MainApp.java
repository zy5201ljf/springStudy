package com.zhangyue.springstudy;


import com.zhangyue.springstudy.controller.UserController;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zhangyue
 **/
public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        BeanFactory context = new ClassPathXmlApplicationContext("Beans.xml");
//        Student student1 = context.getBean("student", Student.class);
//        Student student2 = context.getBean("student", Student.class);
//
//        Employee employee = context.getBean("employee", Employee.class);

        UserController userController = context.getBean("userController", UserController.class);

        userController.doStr();
//        System.out.println(employee);
//        System.out.println(student1);
//        System.out.println(student2);
//        helloWorld.getMessage();

    }
}
