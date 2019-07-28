package com.joe.community.community.dto;

import com.joe.community.community.model.User;
import lombok.Data;

/**
 * Created by codedrinker on 2019/6/2.
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private Integer commentCount;
    private String content;
    private User user;
}
