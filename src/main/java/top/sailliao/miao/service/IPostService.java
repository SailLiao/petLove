package top.sailliao.miao.service;

import top.sailliao.miao.dto.post.PostDto;
import top.sailliao.miao.entity.Post;
import com.baomidou.mybatisplus.extension.service.IService;
import top.sailliao.miao.request.BaseRequest;
import top.sailliao.miao.response.PageResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author petLove app
 * @since 2022-06-08
 */
public interface IPostService extends IService<Post> {

    /**
     * 分页查询
     * @param request 请求
     */
    PageResponse<PostDto> list(BaseRequest request);
}
