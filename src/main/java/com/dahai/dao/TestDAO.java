package com.dahai.dao;

import com.dahai.dao.model.Test;
import com.dahai.dao.model.TestExample;
import org.springframework.stereotype.Repository;

/**
 * TestDAO继承基类
 */
@Repository
public interface TestDAO extends MyBatisBaseDao<Test, Long, TestExample> {
    int insertNotSame(Test test);
}