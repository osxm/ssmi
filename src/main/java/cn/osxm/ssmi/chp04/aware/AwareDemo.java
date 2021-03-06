/**
 * @Title: AwareDemo.java
 * @Package cn.osxm.ssmi.chp4.aware
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月28日 下午9:52:58
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: AwareDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class AwareDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/osxm/ssmi/chp04/awareContext.xml");

		UserWithBeanNameAware userWithBeanNameAware = (UserWithBeanNameAware) context.getBean("user1");
		System.out.println(userWithBeanNameAware.getBeanName());
		User user = (User) context.getBean("user2");
		System.out.println(user.getBeanName());

		// bean类继承BeanFactoryAware，通过BeanFactory获取bean
		ImplBeanFactoryAware implBeanFactoryAware = (ImplBeanFactoryAware) context.getBean("implBeanFactoryAware");
		System.out.println(implBeanFactoryAware.getUser());

		// 获取事件发布器发布事件
		UserService userService = (UserService) context.getBean("userService");
		user = new User();
		user.setName("Oscar");
		userService.register(user);

	}
}
