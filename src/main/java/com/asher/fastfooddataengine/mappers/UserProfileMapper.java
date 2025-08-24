package com.asher.fastfooddataengine.mappers;

import com.asher.fastfooddataengine.model.UserProfile;
import org.apache.ibatis.annotations.Mapper;

import java.rmi.Remote;


/**
 * @author ：Asher
 * @Description ：
 * @Date ：2025/8/24 12:14
 */
@Mapper
public interface UserProfileMapper extends Remote  {

    /**
     * 通过 id 查询用户信息
     * @param userId
     * @return
     */
    UserProfile getUserByUserId(Long userId);

}