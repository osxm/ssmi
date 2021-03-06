/**
 * @Title: ConfigurationAnno.java
 * @Package cn.osxm.ssmi.chp4.javacfg
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��27�� ����6:34:01
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.javacfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.osxm.ssmi.com.Bar;
import cn.osxm.ssmi.com.Foo;

/**
 * @ClassName: ConfigurationAnno
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@Configuration
public class ConfigurationAnno {
	
	@Bean
	public Bar bar(Foo foo) {
		return new Bar(foo());
	}
	
	@Bean
	public Bar bar1() {
		return new Bar(foo());
	}
	
	@Bean
	public Bar bar2() {
		return new Bar(foo());
	}

	@Bean
	public Foo foo() {
		return new Foo();
	}
}
