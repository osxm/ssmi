/**
 * @Title: BeanInitialDemo.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018��12��10�� ����9:14:46
 * @version V1.0
 */

package cn.osxm.ssmi.chp04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.osxm.ssmi.chp04.WithInnerClass.InnerClass;

/**
  * @ClassName: BeanInitialDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class BeanInitialDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml",BeanInitialDemo.class);
		ThirdService thirdService = (ThirdService)context.getBean("thirdService");
		System.out.println(thirdService);
		
	    thirdService = (ThirdService)context.getBean("thirdService2");
		System.out.println(thirdService);
		
		FourService fourService = (FourService)context.getBean("fourService");
		System.out.println(fourService);
		
		InnerClass innerObject = (InnerClass)context.getBean("innerObject");
		innerObject.innerMethod();
		
		innerObject =  new WithInnerClass.InnerClass();
		innerObject.innerMethod();
		
		OuterClass.InnerClass  inner = new OuterClass.InnerClass();
		inner.innerMethod();
	}

}
