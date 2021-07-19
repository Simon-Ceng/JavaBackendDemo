package com.manager.system.dao;

import com.manager.system.model.ManagerUser;
import com.manager.system.model.ManagerUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerUserMapper {
    long countByExample(ManagerUserExample example);

    int deleteByExample(ManagerUserExample example);

    int deleteByPrimaryKey(Integer userPkid);

    int insert(ManagerUser record);

    int insertSelective(ManagerUser record);

    List<ManagerUser> selectByExample(ManagerUserExample example);

    ManagerUser selectByPrimaryKey(Integer userPkid);

    int updateByExampleSelective(@Param("record") ManagerUser record, @Param("example") ManagerUserExample example);

    int updateByExample(@Param("record") ManagerUser record, @Param("example") ManagerUserExample example);

    int updateByPrimaryKeySelective(ManagerUser record);

    int updateByPrimaryKey(ManagerUser record);
}