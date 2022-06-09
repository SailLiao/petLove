package top.sailliao.miao.dto.post;

import lombok.Data;

import java.util.Date;

/**
 * @author 1065500519@qq.com
 */
@Data
public class PostDto {

    private Long userId;

    private String title;

    private Date createTime;

}
