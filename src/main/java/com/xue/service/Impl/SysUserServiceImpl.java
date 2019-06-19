package com.xue.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xue.entity.model.SysUser;
import com.xue.repository.dao.SysUserMapper;
import com.xue.service.SysUserService;
@Service
public class SysUserServiceImpl implements SysUserService {
	
	@Autowired
	private SysUserMapper sysUserMapper;

	@Override
	public SysUser selectUserByName(String username) {
		// TODO Auto-generated method stub
		return sysUserMapper.selectUserByName(username);
	}

	@Override
	public SysUser selectUserById(Integer id) {
		// TODO Auto-generated method stub
		return sysUserMapper.selectUserById(id);
	}
	
	

}
