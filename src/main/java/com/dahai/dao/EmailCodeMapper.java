package com.dahai.dao;

import com.dahai.dao.model.EmailCode;
import com.dahai.dao.model.EmailCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmailCodeMapper {
    long countByExample(EmailCodeExample example);

    int deleteByExample(EmailCodeExample example);

    int insert(EmailCode record);

    int insertSelective(EmailCode record);

    List<EmailCode> selectByExample(EmailCodeExample example);

    int updateByExampleSelective(@Param("record") EmailCode record, @Param("example") EmailCodeExample example);

    int updateByExample(@Param("record") EmailCode record, @Param("example") EmailCodeExample example);
}