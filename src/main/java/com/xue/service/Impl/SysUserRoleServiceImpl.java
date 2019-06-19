package com.xue.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xue.entity.model.SysUserRole;
import com.xue.repository.dao.SysUserRoleMapper;
import com.xue.service.SysUserRoleService;
@Service
public class SysUserRoleServiceImpl implements SysUserRoleService {
	
	@Autowired
	private SysUserRoleMapper sysUserRoleMapper;

	@Override
	public List<SysUserRole> selectUserRoleByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return sysUserRoleMapper.selectUserRoleByUserId(userId);
	}
	
	

}
