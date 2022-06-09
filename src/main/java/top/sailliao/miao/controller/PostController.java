package top.sailliao.miao.controller;


import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import top.sailliao.miao.dto.post.PostDto;
import top.sailliao.miao.request.BaseRequest;
import top.sailliao.miao.response.PageResponse;
import top.sailliao.miao.serviceImpl.PostServiceImpl;

import javax.validation.Valid;

/**
 * <p>
 *  帖子基础类
 * </p>
 *
 * @author petLove app
 * @since 2022-06-08
 */
@RestController
@RequestMapping("/post")
public class PostController {

    Logger logger = LoggerFactory.getLogger(PostController.class);

    @Autowired
    PostServiceImpl postService;

    /**
     * 帖子分页查询
     * @param request 请求
     */
    @PostMapping("/list")
    public PageResponse<PostDto> listActivityReadHistory(@RequestBody BaseRequest request){
        return postService.list(request);
    }

}
