/**
 * @Title: Servlet3FileUploadInitializer.java
 * @Package cn.osxm.ssmi.chp09.fileupload
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��6��13�� ����8:44:58
 * @version V1.0
 */

package cn.osxm.ssmi.chp09.fileupload;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

/**
 * @ClassName: Servlet3FileUploadInitializer
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class Servlet3FileUploadInitializer
//extends
//AbstractAnnotationConfigDispatcherServletInitializer
{
//@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {};
	}

//@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

//@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

//@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		// registration.setMultipartConfig(getMultipartConfigElement());
		registration.setMultipartConfig(new MultipartConfigElement("C:/temp/"));
	}

	@SuppressWarnings("unused")
	private MultipartConfigElement getMultipartConfigElement() {
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(LOCATION, MAX_FILE_SIZE,
				MAX_REQUEST_SIZE, FILE_SIZE_THRESHOLD);
		return multipartConfigElement;
	}

	private static final String LOCATION = "C:/temp/"; // Temporary location where files will be stored

	private static final long MAX_FILE_SIZE = 5242880; // 5MB : Max file size.
														// Beyond that size spring will throw exception.
	private static final long MAX_REQUEST_SIZE = 20971520; // 20MB : Total request size containing Multi part.

	private static final int FILE_SIZE_THRESHOLD = 0; // Size threshold after which files will be written to disk

}
