/**
 * @Title: SpringAOPTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��5��18�� ����5:35:45
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.osxm.ssmi.chp08.aop.springaspect.UserService;
/**
  * @ClassName: SpringAOPTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp08/spring-aop.xml")
public class SpringAOPTests {

    @Autowired
    private UserService userService;

    @Test
    public void testUserAddPointCut() {
        userService.add();
    }
}