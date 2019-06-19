package com.xue.service;

import java.util.List;

import com.xue.entity.model.SysUserRole;

public interface SysUserRoleService {
	
	public List<SysUserRole> selectUserRoleByUserId(Integer userId);
	

}
