package com.manager.system.dao;

import com.manager.system.model.ManagerUserGroup;
import com.manager.system.model.ManagerUserGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerUserGroupMapper {
    long countByExample(ManagerUserGroupExample example);

    int deleteByExample(ManagerUserGroupExample example);

    int deleteByPrimaryKey(Integer groupPkid);

    int insert(ManagerUserGroup record);

    int insertSelective(ManagerUserGroup record);

    List<ManagerUserGroup> selectByExample(ManagerUserGroupExample example);

    ManagerUserGroup selectByPrimaryKey(Integer groupPkid);

    int updateByExampleSelective(@Param("record") ManagerUserGroup record, @Param("example") ManagerUserGroupExample example);

    int updateByExample(@Param("record") ManagerUserGroup record, @Param("example") ManagerUserGroupExample example);

    int updateByPrimaryKeySelective(ManagerUserGroup record);

    int updateByPrimaryKey(ManagerUserGroup record);
}