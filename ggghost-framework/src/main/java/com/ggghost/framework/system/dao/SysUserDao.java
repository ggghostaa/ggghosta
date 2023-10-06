package com.ggghost.framework.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ggghost.framework.system.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author ggghost
 * @create 2023/10/6 9:38
 */
@Mapper
@Component
public interface SysUserDao extends BaseMapper<SysUser> {
    SysUser getById(@Param("user_id") long l);
}
