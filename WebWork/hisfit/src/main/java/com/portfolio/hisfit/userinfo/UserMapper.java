package com.portfolio.hisfit.userinfo;

import java.util.ArrayList;
import java.util.List;

import com.portfolio.hisfit.userinfo.User;
 
public interface UserMapper {
    ArrayList<User> getMembers();

    void insertMember(User member);
    void updateMember(String name);
    void deleteMember(String name);
    public String getIdCount(String id);			//ID 중복체크할때 사용
    public List<User> getAllUser();
}
