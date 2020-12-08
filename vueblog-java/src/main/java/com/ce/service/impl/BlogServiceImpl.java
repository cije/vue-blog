package com.ce.service.impl;

import com.ce.entity.Blog;
import com.ce.mapper.BlogMapper;
import com.ce.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ce
 * @since 2020-12-05
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
