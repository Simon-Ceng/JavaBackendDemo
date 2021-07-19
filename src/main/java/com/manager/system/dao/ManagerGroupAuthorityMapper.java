package com.manager.system.dao;

import com.manager.system.model.ManagerGroupAuthority;
import com.manager.system.model.ManagerGroupAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerGroupAuthorityMapper {
    long countByExample(ManagerGroupAuthorityExample example);

    int deleteByExample(ManagerGroupAuthorityExample example);

    int deleteByPrimaryKey(Integer authorityPkid);

    int insert(ManagerGroupAuthority record);

    int insertSelective(ManagerGroupAuthority record);

    List<ManagerGroupAuthority> selectByExample(ManagerGroupAuthorityExample example);

    ManagerGroupAuthority selectByPrimaryKey(Integer authorityPkid);

    int updateByExampleSelective(@Param("record") ManagerGroupAuthority record, @Param("example") ManagerGroupAuthorityExample example);

    int updateByExample(@Param("record") ManagerGroupAuthority record, @Param("example") ManagerGroupAuthorityExample example);

    int updateByPrimaryKeySelective(ManagerGroupAuthority record);

    int updateByPrimaryKey(ManagerGroupAuthority record);
}