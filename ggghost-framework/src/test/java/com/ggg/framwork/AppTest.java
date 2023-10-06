package com.ggg.framwork;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ggghost.framework.App;
import com.ggghost.framework.system.dao.SysUserDao;
import com.ggghost.framework.system.entity.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Unit test for simple App.
 */
@SpringBootTest(classes = {App.class})
public class AppTest
{
    @Autowired
    SysUserDao sysUserDao;

    @Test
    public void test1() {
        LambdaQueryWrapper<SysUser> wrapper = new LambdaQueryWrapper<>();
        QueryWrapper<Object> userId = new QueryWrapper<>().eq("user_id", "1");
        SysUser sysUser = sysUserDao.selectOne(wrapper.eq(SysUser::getUserId, "1"));
        System.out.println(sysUser.toString());
    }


}
