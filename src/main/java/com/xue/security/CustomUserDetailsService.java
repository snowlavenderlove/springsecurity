package com.xue.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.xue.entity.model.SysRole;
import com.xue.entity.model.SysUser;
import com.xue.entity.model.SysUserRole;
import com.xue.service.SysRoleService;
import com.xue.service.SysUserRoleService;
import com.xue.service.SysUserService;
@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private SysUserService sysUserService;
	
	@Autowired
	private SysRoleService sysRoleService;
	
	@Autowired
	private SysUserRoleService sysUserRoleService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		//从数据库user表中查询登陆者用户信息
		SysUser user = sysUserService.selectUserByName(username);
		
		if(null == user){
			throw new UsernameNotFoundException("用户不存在");
		}
		//从数据库sys_user_role表中查询登陆者所对应的用户权限关联信息
		List<SysUserRole> userRoleList = sysUserRoleService.selectUserRoleByUserId(user.getId());
		
		for(SysUserRole datas:userRoleList){
			//根据用户权限关联信息表中的权限id,从数据库sys_role表中查询登陆者所对应权限
			SysRole role = sysRoleService.selectRoleById(datas.getRoleId());
			
			authorities.add(new SimpleGrantedAuthority(role.getName()));
		}
		
		
		return new User(user.getUsername(),user.getPassword(),authorities);
	}
	
	

}
