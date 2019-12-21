package com.wangyb.springlearning.vueserver.mapper;

import com.wangyb.springlearning.vueserver.config.BaseMapper;
import com.wangyb.springlearning.vueserver.entity.SysLogInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wangyb
 * @Date 2019/5/6 14:57
 * Modified By:
 * Description:
 */
@Mapper
//@CacheNamespaceRef(SysLogInfoMapper.class)
public interface SysLogInfoMapper extends BaseMapper<SysLogInfo> {

}
