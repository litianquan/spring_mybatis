package org.fkit.validator;

import org.fkit.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */

// 实现Spring的Validator接口
@Repository("userValidator")
public class UserValidator implements Validator {

	// 该校验器能够对clazz类型的对象进行校验。
	@Override
	public boolean supports(Class<?> clazz) {
		// User指定的 Class 参数所表示的类或接口是否相同，或是否是其超类或超接口。
		return User.class.isAssignableFrom(clazz);
	}

	// 对目标类target进行校验，并将校验错误记录在errors当中
	@Override
	public void validate(Object target, Errors errors) {
		/**
		使用ValidationUtils中的一个静态方法rejectIfEmpty()来对loginname属性进行校验，
		假若'loginname'属性是 null 或者空字符串的话，就拒绝验证通过 。
		*/
		ValidationUtils.rejectIfEmpty(errors, "loginname", null, "登录名不能为空");  
		ValidationUtils.rejectIfEmpty(errors, "password", null, "密码不能为空");  
		User user = (User)target;
		if(user.getLoginname().length() > 10){
			// 使用Errors的rejectValue方法验证
			errors.rejectValue("loginname", null, "用户名不能超过10个字符");
		}
		if(user.getPassword() != null 
				&& !user.getPassword().equals("") 
				&& user.getPassword().length() < 6){
			errors.rejectValue("password", null, "密码不能小于6位");
		}
	}

}
