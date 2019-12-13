package com.zyc.summer.springboot.mybatisplus.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统用户表
 * </p>
 *
 * @author zhuyicheng
 * @since 2019-12-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_sys_user")
public class TbSysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    @TableId(value = "seq_id", type = IdType.AUTO)
    private Integer seqId;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String userPwd;

    /**
     * 所属角色ID
     */
    private String roleId;

    /**
     * 所属企业ID
     */
    private String siteId;

    /**
     * 所属镇(街道)ID
     */
    private String streetId;

    /**
     * 注册时间
     */
    private LocalDateTime registrationTime;

    /**
     * 上次登录时间
     */
    private LocalDateTime lastLoginTime;

    /**
     * 上次登录IP
     */
    private String lastLoginIp;

    /**
     * 备注
     */
    private String memo;

    /**
     * 创建者ID
     */
    private String createUserId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改者ID
     */
    private String updateUserId;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;


}
