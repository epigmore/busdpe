package com.buha.busdpe.base.repository;

import com.buha.busdpe.base.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SysUserRepository extends JpaRepository<SysUser,String> {

    //查询用户名称包含username字符串的用户对象
    List<SysUser> findByUsernameContaining(String username);
    //获得单个用户对象，根据username和pwd的字段匹配
    SysUser getByUsernameIsAndPasswordIs(String username, String password);
    //精确匹配username的用户对象
    SysUser getByUsernameIs(String username);
}
