package com.manager.system.dao;

import com.manager.system.model.ManagerUserView;
import com.manager.system.model.ManagerUserViewExample;
import java.util.List;

public interface ManagerUserViewMapper {
    long countByExample(ManagerUserViewExample example);

    int insert(ManagerUserView record);

    int insertSelective(ManagerUserView record);

    List<ManagerUserView> selectByExample(ManagerUserViewExample example);
}