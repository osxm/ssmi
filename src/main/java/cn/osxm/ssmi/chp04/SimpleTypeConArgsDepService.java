/**
 * @Title: SimpleTypeDepService.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018��12��19�� ����6:29:25
 * @version V1.0
 */

package cn.osxm.ssmi.chp04;
/**
  * @ClassName: SimpleTypeDepService
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class SimpleTypeConArgsDepService {

	private int iFoo;
	
	private String sBar;
	
	public SimpleTypeConArgsDepService(int iFoo,String sBar) {
		this.iFoo = iFoo;
		this.sBar = sBar;
	}
	
	public void fooBar() {
		System.out.println("iFoo="+iFoo);
		System.out.println("sBar="+sBar);
	}
}
