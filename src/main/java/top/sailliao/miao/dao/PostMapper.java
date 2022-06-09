package top.sailliao.miao.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javafx.geometry.Pos;
import top.sailliao.miao.dto.post.PostDto;
import top.sailliao.miao.entity.Post;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author petLove app
 * @since 2022-06-08
 */
public interface PostMapper extends BaseMapper<Post> {
    /**
     * 条件分页查询
     *
     * @param page   分页信息
     * @param userId 用户ID
     */
    IPage<PostDto> findPostByUserId(Page<?> page, Long userId);
}
