package com.wangyb.springlearning.vueserver.mapper;

import com.wangyb.springlearning.vueserver.config.BaseMapper;
import com.wangyb.springlearning.vueserver.entity.SysUserRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/9 9:12
 * Modified By:
 * Description:
 */
@Mapper
//@CacheNamespaceRef(SysUserRoleMapper.class)
public interface SysUserRoleMapper extends BaseMapper<SysUserRole>{
    /**
     * 根据组织id删除所有的角色对应关系
     * @param organizationId
     * @return
     */
    Integer deleteUserRoleByOrganizationId(Integer organizationId);
}
