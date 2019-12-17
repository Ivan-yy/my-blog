package com.yy.myblog.user.dao;

import com.yy.myblog.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author Ivan yu
 * @since 2019-12-17
 * @version ${version}
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
