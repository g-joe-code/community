package com.joe.community.community.mapper;


import com.joe.community.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}