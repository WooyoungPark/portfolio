package com.portfolio.hisfit.controller;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping("join.do")
    public String join(@RequestParam HashMap<String, Object> params)
    {
        System.out.println(params);
//        service.joinMember(params);
        return "join"; 
    }
	
}
