package com.xue.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xue.entity.model.SysRole;
import com.xue.repository.dao.SysRoleMapper;

@Service
public class SysRoleServiceImpl implements com.xue.service.SysRoleService {
	
	@Autowired
	private SysRoleMapper sysRoleMapper;

	@Override
	public SysRole selectRoleById(Integer id) {
		// TODO Auto-generated method stub
		return sysRoleMapper.selectRoleById(id);
	}
	
	

}
