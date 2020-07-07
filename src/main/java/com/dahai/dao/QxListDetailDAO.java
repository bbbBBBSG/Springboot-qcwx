package com.dahai.dao;

import com.dahai.dao.model.QxListDetail;
import com.dahai.dao.model.QxListDetailExample;
import org.springframework.stereotype.Repository;

/**
 * QxListDetailDAO继承基类
 */
@Repository
public interface QxListDetailDAO extends MyBatisBaseDao<QxListDetail, String, QxListDetailExample> {

    int insertNotSame(QxListDetail qxListDetail);
}