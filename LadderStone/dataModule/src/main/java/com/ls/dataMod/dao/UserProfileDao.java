package com.ls.dataMod.dao;
 
import java.util.List;
 
import com.ls.dataMod.model.UserProfile;
 
 
public interface UserProfileDao {
 
    List<UserProfile> findAll();
     
    UserProfile findByType(String type);
     
    UserProfile findById(int id);
}