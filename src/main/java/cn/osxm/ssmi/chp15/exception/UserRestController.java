/**
 * @Title: UserRestController.java
 * @Package cn.osxm.ssmi.chp15.exception
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��7��11�� ����6:16:39
 * @version V1.0
 */

package cn.osxm.ssmi.chp15.exception;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: UserRestController
 * @Description: TODO
 * @author osxm:oscarxueming
 */

@RestController
public class UserRestController {

	@PostMapping("/exception/responseEntityException")
	public User responseEntityException() throws Exception {
		return new User(1, "Zhang San");
	}

	@RequestMapping("/exception/responseEntityMyException")
	// @PostMapping("/exception/responseEntityException")
	public User responseEntityMyException() throws Exception {
		throw new MyJsonException();
		// return new User(1,"Zhang San");
	}

}
