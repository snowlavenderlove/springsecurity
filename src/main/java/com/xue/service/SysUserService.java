package com.xue.service;

import com.xue.entity.model.SysUser;

public interface SysUserService {
	
	public SysUser selectUserByName(String username);
	
	public SysUser selectUserById(Integer id);

}
