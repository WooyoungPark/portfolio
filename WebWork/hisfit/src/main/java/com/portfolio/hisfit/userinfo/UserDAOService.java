package com.portfolio.hisfit.userinfo;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 //Service 클래스를 Repository로 등록함으로서 빈(bean) 클래스로 사용하능하게한다.  

@Repository
public class UserDAOService implements UserDAO {
 
	//Autowired를 사용하여 sqlSession을 사용할수 있다.
    @Autowired
    private SqlSession sqlSession;
    
    @Override
    public ArrayList<User> getMembers() {
        ArrayList<User> result = new ArrayList<User>();
        //sqlSession을 통하여 매핑한다.
         UserMapper memberMapper = sqlSession.getMapper(UserMapper.class);
         
        //getMember()의 메소드명과 mapper.xml과 id는 동일해야한다.
        result = memberMapper.getMembers();
        
        return result;
    }
    
	@Override
	public List<User> getAllUser() {
		UserMapper memberMapper = sqlSession.getMapper(UserMapper.class);
		return memberMapper.getAllUser();
	}
    
    @Override
    public void insertMember(User member) {
        UserMapper memberMapper = sqlSession.getMapper(UserMapper.class);
        memberMapper.insertMember(member);
    }
    //아래부분은 코딩하다 말았음
    @Override
    public void updateMember(String name) {
    }
    @Override
    public void deleteMember(String name) {
        UserMapper memberMapper = sqlSession.getMapper(UserMapper.class);
        memberMapper.deleteMember(name);
    }
    
    @Override
    public String getIdCount(String id) {
    	UserMapper memberMapper = sqlSession.getMapper(UserMapper.class);
    	memberMapper.getIdCount(id);
    	System.out.println("[MemberDAOService] count : " + id);
    	return memberMapper.getIdCount(id);
    }




}

