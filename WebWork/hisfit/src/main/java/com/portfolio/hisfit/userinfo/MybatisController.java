package com.portfolio.hisfit.userinfo;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.portfolio.hisfit.userinfo.User;
import com.portfolio.hisfit.userinfo.UserDAOService;
 

@Controller
public class MybatisController {
    
    @Autowired
    private UserDAOService userDAOService;
    
    private static final Logger logger = LoggerFactory.getLogger(MybatisController.class);
    
    @RequestMapping("/join")
    public String join() {
    	
    	return "join";
    }
    
    @RequestMapping("/userList")
    public ModelAndView userList(Model model) {
    	ModelAndView mv = new ModelAndView("jsonView");
    	mv.setViewName("userList");
    	
    	return mv;
    }
    
    @RequestMapping("/getUserList")
    public ModelAndView getUserList(Model model) {
    	ModelAndView mv = new ModelAndView("jsonView");
    	List<User> userList  = userDAOService.getAllUser();
    	
    	mv.setViewName("userList");
    	mv.addObject("userList", userList);
    	
    	return mv;
    }
    
    
    
    
  //시작 메인화면.
    @RequestMapping("/main")
    public ModelAndView main(Locale locale, Model model) {
        logger.info("Welcome main.", locale);
 
        // view 화면인 main.jsp에 DB로부터 읽어온 데이터를 보여준다.
        ModelAndView result = new ModelAndView();
        //addObject view에 넘어가는 데이터
        List<User> memberList = userDAOService.getMembers();
        result.addObject("result", memberList);
        result.setViewName("joinview");
        return result;
    }
    
    //insert 버튼 클릭시 값을 가져와서 result.jsp로 화면전환 해준다.
    @RequestMapping(value ="/insert", method = RequestMethod.POST)
    public ModelAndView insert(HttpServletRequest request){
        
        // HttpServletRequest를 이용하여 main.jsp로부터 값을 가져온다 getParameter로는 id값을 가져옴.
        User member = new User();
/*        member.set_name((String) request.getParameter("name"));
        member.set_email((String) request.getParameter("email"));
        member.set_phone((String) request.getParameter("phone"));*/
        
        userDAOService.insertMember(member);
        System.out.println("insert complet");
        
        //아래부분은 select값을 result.jsp파일에 보여주기 위해 또사용.
        ModelAndView result = new ModelAndView();
        List<User> memberList = userDAOService.getMembers();
        result.addObject("result", memberList);
        result.setViewName("result");
        return result;
    }
    
    @ResponseBody
    @RequestMapping(value ="/idOverlapCheck.do")
    public String checkOverlapID (HttpServletRequest request){        
    	String id = request.getParameter("id");
    	String count = userDAOService.getIdCount(id);
    	return count;
    }
    
    

}
