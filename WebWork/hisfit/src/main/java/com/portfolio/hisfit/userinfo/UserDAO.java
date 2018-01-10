package com.portfolio.hisfit.userinfo;

import java.util.ArrayList;
import java.util.List;
 
public interface UserDAO {
	//MemerMapper와 내용은 같으나 DAO를 Mapper의 역활로서 함께 사용시 문제가 발생하기에 따로 구분하여 사용하는 것이 좋다
    public ArrayList<User> getMembers();
    public void insertMember(User member);
    public void updateMember(String name);
    public void deleteMember(String name);
    public String getIdCount(String id);			//ID 중복체크할때 사용
    public List<User> getAllUser();
}

