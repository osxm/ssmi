/**
 * @Title: MyDateClassEditor.java
 * @Package cn.osxm.ssmi.chp08.propertyeditor
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��5��26�� ����10:46:10
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.propertyeditor;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
  * @ClassName: MyDateClassEditor
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class MyDateClassEditor extends PropertyEditorSupport{
	@Override
    public void setAsText(String text) throws IllegalArgumentException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = format.parse(text);
        } catch (ParseException e) {
            format = new SimpleDateFormat("yyyy-MM-dd");
            try {
                date = format.parse(text);
            } catch (ParseException e1) {
            }
        }
        setValue(date);
    }
}
