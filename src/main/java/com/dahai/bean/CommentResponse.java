package com.dahai.bean;

import com.dahai.dao.model.Comment;
import com.dahai.dao.model.User;

public class CommentResponse {

    private Comment comment;

    private UserResponse user;

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public UserResponse getUser() {
        return user;
    }

    public void setUser(UserResponse user) {
        this.user = user;
    }
}
