package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.UserController;
import com.dao.UserDao;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// UserDao userDao = new UserDao(); //10 times -> allocating -> gc
		// userDao.add();

		// spring -> Ioc container -> object life cycle

		// singleton design pattern

		// IOC ->
		// 1) BeanFactory
		// 2) ApplicationContext
		// FileSystemXmlApplicationContext {spring.xml --> project outside }
		// ClassPathXmlApplicationContext {spring.xml --> class path }
		// WebXmlApplicationContext
		// anno

		// spring -> 1)spring-core 2)spring-context 3)spring-el 4)spring-bean

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		UserDao userDao1 = context.getBean("userDao", UserDao.class);
		UserDao userDao2 = context.getBean("userDao", UserDao.class);
		UserDao userDao3 = context.getBean("userDao", UserDao.class);

		System.out.println(userDao1);
		System.out.println(userDao2);
		System.out.println(userDao3);

		UserController userController = context.getBean("userController", UserController.class);

		System.out.println(userController);
		System.out.println(userController.userDao);
		System.out.println(userController.paymentDao);
	}

}
