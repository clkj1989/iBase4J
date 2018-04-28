package org.ibase4j.service.impl;

import org.ibase4j.mapper.SysEmailConfigMapper;
import org.ibase4j.model.SysEmailConfig;
import org.ibase4j.service.ISysEmailConfigService;
import org.springframework.cache.annotation.CacheConfig;

import com.alibaba.dubbo.config.annotation.Service;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

import top.ibase4j.core.base.BaseService;

/**
 * @author ShenHuaJie
 *
 */
@CacheConfig(cacheNames = "sysEmailConfig")
@Service(interfaceClass = ISysEmailConfigService.class)
@MotanService(interfaceClass = ISysEmailConfigService.class)
public class SysEmailConfigServiceImpl extends BaseService<SysEmailConfig, SysEmailConfigMapper>
    implements ISysEmailConfigService {

}
