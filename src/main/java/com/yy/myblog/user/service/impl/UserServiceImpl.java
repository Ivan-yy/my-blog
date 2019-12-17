package com.yy.myblog.user.service.impl;

import com.yy.myblog.user.entity.User;
import com.yy.myblog.user.dao.UserMapper;
import com.yy.myblog.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xh.marketplatform.common.entity.PageDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhangqinghua
 * @since 2019-12-17
 * @version ${version}
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
        private Logger logger = LoggerFactory.getLogger(getClass());

        @Autowired
        private UserMapper userMapper;

        @Override
        public IPage<User> list(PageDto<User> pageDto) {

        LambdaQueryWrapper<User> queryWrapper = Wrappers.lambdaQuery();
        return userMapper.selectPage(pageDto, queryWrapper);
        }
}
