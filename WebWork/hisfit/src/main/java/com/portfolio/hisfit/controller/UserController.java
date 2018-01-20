package com.portfolio.hisfit.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.portfolio.dto.UserVO;
import com.portfolio.service.UserService;

/**
 * <pre> 
 * com.portfolio.hisfit.userservice
 * UserController.java
 * [ Description ]
 * 
 * </pre>
 * [ History ]
 * @author	 박우영
 * @Date		 2018. 1. 18. 오후 4:02:33
 * <pre>
 * ---- 수정이력[Name - Date - Description] ----
 * 박우영 - 2018. 1. 18. - 최초생성
 * </pre>
 */

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@ResponseBody
	@RequestMapping(value = "/ajax.overlap", method = RequestMethod.GET)
	public HashMap<String, Object> checkId(@RequestParam(value="userID") String userID) {
		
		String strResult = service.checkID(userID);
		
		Boolean blnIsExist = true;
		
		if(strResult==null||strResult.equals("")) {
			blnIsExist = !blnIsExist;
		}
	    HashMap<String, Object> hashmap = new HashMap<String, Object>();
	    hashmap.put("result", blnIsExist);
	     
	    return hashmap;
	}
	
	
	//회원가입 완료할때 
	@ResponseBody
	@RequestMapping(value="/ajax.join", method=RequestMethod.POST)
	public Map<String , String> joinOK(@RequestParam HashMap<String, Object> params) {
		System.out.println(params);
		UserVO user = new UserVO();
		user.setId(params.get("id").toString());
		user.setPwd(params.get("pwd").toString());
		user.setPwdQ( Integer.parseInt(params.get("pwdQ").toString()));
		user.setPwdA(params.get("pwdA").toString());
		user.setName(params.get("name").toString());
		user.setZip(params.get("zip").toString());
		user.setAdd1(params.get("add1").toString());
		user.setAdd2(params.get("add2").toString());
		user.setTel(params.get("tel1").toString() + "/" + params.get("tel2").toString() + "/" + params.get("tel3").toString() );
		user.setPhone(params.get("phone1").toString() + "/" + params.get("phone2").toString() + "/" + params.get("phone3").toString() );
		user.setEmail(params.get("email1").toString() + "@" + params.get("email2").toString());
		user.setType(Integer.parseInt(params.get("memberType").toString()));
		user.setAuthority("ROLE_USER");
		
		service.insertUser(user);
	    
	    Map<String , String> map = new  HashMap<String, String>();
	    map.put("result", "1");
	 
	    return map;
	}


	
}
