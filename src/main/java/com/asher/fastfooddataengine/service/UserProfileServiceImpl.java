package com.asher.fastfooddataengine.service;
import com.asher.fastfooddataengine.mappers.UserProfileMapper;
import com.asher.fastfooddataengine.model.UserProfile;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;
import java.util.List;

/**
 * @author ：Asher
 * @Description ：
 * @Date ：2025/8/24 17:27
 */
@Slf4j
@Service("userProfileServiceImpl")
@DubboService
public class UserProfileServiceImpl implements UserProfileService {
    @Resource
    private UserProfileMapper userProfileMapper;

    // 必须声明抛出RemoteException的构造函数
    public UserProfileServiceImpl() {
    }

    @Override
    public UserProfile getUserByUserId(Long userId, List<String> fields){
        System.out.println("getUserByUserId 方法被调用，用户信息: " + userId);
        if (userId <= 0) {
            log.error("用户ID不合法");
            return null;
        }
        try {
            UserProfile user = userProfileMapper.getUserByUserId(userId);
            if (user == null) {
                log.error("用户不存在");
            }
            return user;
        } catch (Exception e) {
            log.error("查询用户信息出错", e);
            return new UserProfile();
        }
    }

    @Override
    public boolean addUserProfile(UserProfile user){
        // 实际项目中这里会调用Mapper插入数据
        System.out.println("新增用户: " + user.getUserId());
        return true;
    }
}
