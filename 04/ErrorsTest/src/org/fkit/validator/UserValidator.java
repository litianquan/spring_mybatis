package org.fkit.validator;

import org.fkit.domain.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */
public class UserValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		// 验证username、sex和age是否为null
		ValidationUtils.rejectIfEmpty(errors, "username", null, "用户名不能为空");  
	    ValidationUtils.rejectIfEmpty(errors, "sex", null, "性别不能为空"); 
	    ValidationUtils.rejectIfEmpty(errors, "age", null, "年龄不能为空"); 
	}

}
