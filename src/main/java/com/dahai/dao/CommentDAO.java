package com.dahai.dao;

import com.dahai.dao.model.Comment;
import com.dahai.dao.model.CommentExample;
import org.springframework.stereotype.Repository;

/**
 * CommentDAO继承基类
 */
@Repository
public interface CommentDAO extends MyBatisBaseDao<Comment, Integer, CommentExample> {
}