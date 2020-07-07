package com.dahai.dao;

import com.dahai.dao.model.QxHome;
import com.dahai.dao.model.QxHomeExample;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * QxHomeDAO继承基类
 */
@Repository
public interface QxHomeDAO extends MyBatisBaseDao<QxHome, QxHome, QxHomeExample> {
    @Select("TRUNCATE TABLE qx_home")
    void deleteAll();
}