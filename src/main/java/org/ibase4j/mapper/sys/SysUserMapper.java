package org.ibase4j.mapper.sys;

import org.apache.ibatis.annotations.CacheNamespace;
import org.ibase4j.model.sys.SysUser;

import top.ibase4j.core.base.BaseMapper;
import top.ibase4j.core.support.cache.mybatis.EhcacheRedisCache;

@CacheNamespace(implementation = EhcacheRedisCache.class)
public interface SysUserMapper extends BaseMapper<SysUser> {
}