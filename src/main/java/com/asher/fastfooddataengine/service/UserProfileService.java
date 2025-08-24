package com.asher.fastfooddataengine.service;

import com.asher.fastfooddataengine.model.UserProfile;

import java.rmi.RemoteException;
import java.util.List;


/**
 * @author ：Asher
 * @Description ：
 * @Date ：2025/8/24 17:26
 */
public interface UserProfileService {

    /**
     * 根据用户ID获取用户信息
     * @param userId
     * @return
     * @throws RemoteException
     */
    UserProfile getUserByUserId(Long userId, List<String> fields) throws RemoteException;

    /**
     * 新增用户信息
     * @param user
     * @return
     * @throws RemoteException
     */
    boolean addUserProfile(UserProfile user) throws RemoteException;
}
