package com.asher.fastfooddataengine.model;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author ：Asher
 * @Description ：
 * @Date ：2025/8/24 13:04
 */
@Data
public class UserProfile implements Serializable {

    @Serial
    private static final long serialVersionUID = 8369422332661025000L;

    // 注意：SQL中没有显式列出id字段，但实际表中通常会有主键id
    private Long userId;

    // 性别 (0-1)
    private Integer gender;

    // 生日
    private LocalDate birthday;

    // 个人签名
    private String signature;

    // 创建时间
    private LocalDateTime createTime;

    // 更新时间
    private LocalDateTime updateTime;

    // 是否认证 (0或1)
    private Integer isVerified;

    // 粉丝数量
    private Long followerCount;

    // 关注数量
    private Long followingCount;

    // 总获赞数
    private Long totalLikes;

    // 设备ID
    private String deviceId;

    // 账号状态 (0:冻结, 1:正常)
    private Integer status;

    // 年龄
    private Integer age;

    // 星座
    private String zodiac;

    // 婚姻状态
    private String maritalStatus;

    // 亲子状态
    private String parentingStatus;

    // 家乡城市
    private String hometownCity;

    // 常驻城市
    private String residenceCity;

    // 工作地点经纬度
    private String workLocation;

    // 居住地点经纬度
    private String resideLocation;

    // 兴趣爱好
    private String hobbies;
}