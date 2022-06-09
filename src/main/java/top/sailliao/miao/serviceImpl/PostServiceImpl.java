package top.sailliao.miao.serviceImpl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import top.sailliao.miao.dto.post.PostDto;
import top.sailliao.miao.entity.Post;
import top.sailliao.miao.dao.PostMapper;
import top.sailliao.miao.request.BaseRequest;
import top.sailliao.miao.response.PageResponse;
import top.sailliao.miao.service.IPostService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.sailliao.miao.utils.PageUtil;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author petLove app
 * @since 2022-06-08
 */
@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements IPostService {

    @Autowired
    PostMapper postMapper;

    @Autowired
    PageUtil pageUtil;

    @Override
    public PageResponse<PostDto> list(BaseRequest request) {
        IPage<PostDto> postDtoIPage = postMapper.findPostByUserId(pageUtil.of(request), request.getUserId());
        return PageResponse.of(postDtoIPage, request.getPageSize());
    }
}
