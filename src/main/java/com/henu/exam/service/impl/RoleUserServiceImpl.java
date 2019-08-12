package com.henu.exam.service.impl;

import com.henu.exam.bean.UserRole;
import com.henu.exam.dao.UserRoleMapper;
import com.henu.exam.service.RoleUserService;
import com.henu.exam.util.BaseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleUserServiceImpl implements RoleUserService {

    @Autowired(required = false)
    private UserRoleMapper roleUserMapper;

    @Override
    public int deleteById(String id) {
        return 0;
    }

    @Override
    public int insert(UserRole userRole) {

        userRole.setId(BaseUtil.getUid());
        userRole.setRoleId("3");

        return roleUserMapper.insert(userRole);
    }

    @Override
    public int insertSelective(UserRole userRole) {
        return 0;
    }

    @Override
    public UserRole selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(UserRole userRole) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UserRole userRole) {
        return 0;
    }
}
