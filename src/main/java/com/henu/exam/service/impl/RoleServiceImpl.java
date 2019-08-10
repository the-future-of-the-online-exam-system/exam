package com.henu.exam.service.impl;

import com.henu.exam.bean.Role;
import com.henu.exam.dao.RoleMapper;
import com.henu.exam.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(Role role) {

        return roleMapper.insert(role);
    }

    @Override
    public int insertSelective(Role role) {
        return 0;
    }

    @Override
    public Role selectByPrimaryKey(String role) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Role role) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Role role) {
        return 0;
    }
}
